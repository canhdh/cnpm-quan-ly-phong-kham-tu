/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.dao;

import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.Instant;
import quanlyphongkhamtu.receptionpatient.model.Patient;
import quanlyphongkhamtu.receptionpatient.model.Room;

/**
 *
 * @author tminh
 */
public class RegisteredRoomDAO extends DAO {

    public RegisteredRoomDAO() {
    }
    
    public boolean addRegisteredRoom(Patient patient, Room room) {
        String sql = "INSERT INTO tblregisteredroom(datetime, tblPatient_id, tblRoom_id, tblBill_id) "
                + "VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, Timestamp.from(Instant.now()));
            ps.setInt(2, patient.getId());
            ps.setInt(3, room.getId());
            ps.setInt(4, 1);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
