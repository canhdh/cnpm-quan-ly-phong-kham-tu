/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tminh
 */
public class DAO {
    public static Connection con;
    
    public DAO() {
        if (con == null) {
            String dbUrl = "jdbc:mysql://34.82.224.69:3306/phongkhamtu?autoReconnect=true&useSSL=false&characterEncoding=utf8";
            String dbClass = "com.mysql.jdbc.Driver";
            
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "cnpm", "Cnpm@n07");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
