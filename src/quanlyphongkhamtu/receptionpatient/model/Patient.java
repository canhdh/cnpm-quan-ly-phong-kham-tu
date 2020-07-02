/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.model;

import java.io.Serializable;

/**
 *
 * @author tminh
 */
public class Patient implements Serializable{
    
    private int id;
    private String fullName;
    private int age;
    private String address;
    private String citizenId;
    private String phone;

    public Patient() {
        super();
    }

    public Patient(String fullName, int age, String address, String citizenId, String phone) {
        super();
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.citizenId = citizenId;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
