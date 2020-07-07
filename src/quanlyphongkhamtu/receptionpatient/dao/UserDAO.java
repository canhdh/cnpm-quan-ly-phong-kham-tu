/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import quanlyphongkhamtu.receptionpatient.model.User;
/**
 *
 * @author Dang Huu Canh
 */
public class UserDAO extends DAO {

    public UserDAO() {
        super();
    }
    
    public boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT id, name, address, age, hometown, phone, certificate, position FROM tbluser WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setAge(rs.getInt("age"));
                user.setHometown(rs.getString("hometown"));
                user.setPhone(rs.getString("phone"));
                user.setCertificate(rs.getString("certificate"));
                user.setPosititon(rs.getString("position"));
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
