/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import quanlyphongkhamtu.receptionpatient.model.Payment;
import quanlyphongkhamtu.receptionpatient.model.RegisteredRoom;
import quanlyphongkhamtu.receptionpatient.utils.Constants;

/**
 *
 * @author Dang Huu Canh
 */
public class PaymentDAO extends DAO {

    public PaymentDAO() {
        super();
    }
    
    public boolean addPayment(Payment payment) {
        
        String addPaymentSqlString = "INSERT INTO tblpayment (total, exportTime, type, patientId, isPaid) "
                + "VALUES(?, ?, ?, ?, ?)";
        String addRegisteredRoomSqlString = "INSERT INTO tblregisteredroom(total, registerTime, roomId, patientId, paymentId, userId) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        boolean result = true;
        try {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement(addPaymentSqlString, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, payment.getTotal());
            ps.setTimestamp(2, Timestamp.from(payment.getExportTime()));
            ps.setString(3, payment.getType());
            ps.setInt(4, payment.getPatient().getId());
            ps.setInt(5, (payment.isIsPaid() == true) ? Constants.Status.ENABLED : Constants.Status.DISABLED);
            
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                payment.setId(generatedKeys.getInt(1));
                
                // insert registered room
                for (RegisteredRoom registeredRoom : payment.getRegisteredRooms()) {
                    ps = con.prepareStatement(addRegisteredRoomSqlString, Statement.RETURN_GENERATED_KEYS);
                    
                    ps.setDouble(1, registeredRoom.getTotal());
                    ps.setTimestamp(2, Timestamp.from(registeredRoom.getRegisteredTime()));
                    ps.setInt(3, registeredRoom.getRoom().getId());
                    ps.setInt(4, registeredRoom.getPatient().getId());
                    ps.setInt(5, payment.getId());
                    ps.setInt(6, registeredRoom.getUser().getId());
                    
                    ps.executeUpdate();
                    // get id of the new inserted registeredRoom
                    generatedKeys = ps.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        registeredRoom.setId(generatedKeys.getInt(1));
                    }
                }
                
            }
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
            try {
                con.rollback();
            } catch (Exception ex) {
                result = false;
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                con.setAutoCommit(true); // comment this line in JUnitTest mode
            } catch (Exception ex) {
                result = false;
                ex.printStackTrace();
            }
        }
        return result;
    };
}
