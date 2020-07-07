/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlyphongkhamtu.receptionpatient.model.Room;
import quanlyphongkhamtu.receptionpatient.utils.Constants;

/**
 *
 * @author Dang Huu Canh
 */
public class RoomDAO extends DAO {

    public RoomDAO() {
        super();
    }
    
    public List<Room> searchRoom(String key) {
        List<Room> result = new ArrayList<>();
        String sql = "SELECT * FROM tblroom WHERE lower(type) LIKE lower(?) AND isActive = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ps.setInt(2, Constants.Status.ENABLED);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Room room = new Room();
                room.setId(rs.getInt("id"));
                room.setName(rs.getString("name"));
                room.setType(rs.getString("type"));
                room.setDescription(rs.getString("description"));
                room.setLocation(rs.getString("location"));
                room.setIsActive(rs.getInt("isActive"));
                room.setPrice(rs.getDouble("price"));
                
                result.add(room);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
