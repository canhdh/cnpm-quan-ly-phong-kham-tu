/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dang Huu Canh
 */
public class Patient implements Serializable{
    
    private int id;
    private String name;
    private String address;
    private int age;
    private String citizenId;
    private String phone;
    private ArrayList<MedicalRecord> medicalRecords;

    public Patient() {
        super();
    }

    public Patient(String name, String address, int age, String citizenId, String phone, ArrayList<MedicalRecord> medicalRecords) {
        super();
        this.name = name;
        this.address = address;
        this.age = age;
        this.citizenId = citizenId;
        this.phone = phone;
        this.medicalRecords = medicalRecords;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    
    
}
