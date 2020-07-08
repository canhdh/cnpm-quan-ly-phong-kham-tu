package quanlyphongkhamtu.receptionpatient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import quanlyphongkhamtu.receptionpatient.model.Patient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang Huu Canh
 */
public class PatientDAO extends DAO{

    public PatientDAO() {
        super();
    }
    
    public ArrayList<Patient> searchPatient(String key) {
        ArrayList<Patient> result = new ArrayList<>();
        
        String sql = "SELECT * FROM tblpatient WHERE lower(name) LIKE lower(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setId(rs.getInt("id"));
                patient.setName(rs.getString("name"));
                patient.setAddress(rs.getString("address"));
                patient.setAge(rs.getInt("age"));
                patient.setCitizenId(rs.getString("citizenId"));
                patient.setPhone(rs.getString("phone"));
                
                result.add(patient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean addPatient(Patient patient) {
        String sql = "INSERT INTO tblPatient(name, age, address, citizenId, phone) "
                + "VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, patient.getName());
            ps.setInt(2, patient.getAge());
            ps.setString(3, patient.getAddress());
            ps.setString(4, patient.getCitizenId());
            ps.setString(5, patient.getPhone());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
