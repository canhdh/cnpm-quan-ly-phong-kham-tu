/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;

/**
 *
 * @author Dang Huu Canh
 */
public class Payment implements Serializable {
    
    private int id;
    private double total;
    private Instant exportTime;
    private String type;
    private boolean isPaid;
    private ArrayList<RegisteredRoom> registeredRooms;
    private ArrayList<RequiredTest> requiredTests;
    private ArrayList<RequiredService> requiredServices;
    private ArrayList<Prescription> prescriptions;
    private Patient patient;

    public Payment() {
        super();
    }

    public Payment(double total, Instant exportTime, String type, boolean isPaid, ArrayList<RegisteredRoom> registeredRooms, ArrayList<RequiredTest> requiredTests, ArrayList<RequiredService> requiredServices, ArrayList<Prescription> prescriptions, Patient patient) {
        super();
        this.total = total;
        this.exportTime = exportTime;
        this.type = type;
        this.isPaid = isPaid;
        this.registeredRooms = registeredRooms;
        this.requiredTests = requiredTests;
        this.requiredServices = requiredServices;
        this.prescriptions = prescriptions;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Instant getExportTime() {
        return exportTime;
    }

    public void setExportTime(Instant exportTime) {
        this.exportTime = exportTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<RegisteredRoom> getRegisteredRooms() {
        return registeredRooms;
    }

    public void setRegisteredRooms(ArrayList<RegisteredRoom> registeredRooms) {
        this.registeredRooms = registeredRooms;
    }

    public ArrayList<RequiredTest> getRequiredTests() {
        return requiredTests;
    }

    public void setRequiredTests(ArrayList<RequiredTest> requiredTests) {
        this.requiredTests = requiredTests;
    }

    public ArrayList<RequiredService> getRequiredServices() {
        return requiredServices;
    }

    public void setRequiredServices(ArrayList<RequiredService> requiredServices) {
        this.requiredServices = requiredServices;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
   
}
