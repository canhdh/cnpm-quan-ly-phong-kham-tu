/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.model;

import java.io.Serializable;
import java.time.Instant;
/**
 *
 * @author tminh
 */
public class RegisteredRoom implements Serializable {
    
    private int id;
    private Instant datetime;
    private double price;
    private int tblRoomId;
    private int tblPatientId;
    private int tblMedicalReportId;
    private int tblBillId;

    public RegisteredRoom() {
    }

    public RegisteredRoom(Instant datetime, double price, int tblRoomId, int tblPatientId, int tblMedicalReportId, int tblBillId) {
        this.datetime = datetime;
        this.price = price;
        this.tblRoomId = tblRoomId;
        this.tblPatientId = tblPatientId;
        this.tblMedicalReportId = tblMedicalReportId;
        this.tblBillId = tblBillId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getDatetime() {
        return datetime;
    }

    public void setDatetime(Instant datetime) {
        this.datetime = datetime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTblRoomId() {
        return tblRoomId;
    }

    public void setTblRoomId(int tblRoomId) {
        this.tblRoomId = tblRoomId;
    }

    public int getTblPatientId() {
        return tblPatientId;
    }

    public void setTblPatientId(int tblPatientId) {
        this.tblPatientId = tblPatientId;
    }

    public int getTblMedicalReportId() {
        return tblMedicalReportId;
    }

    public void setTblMedicalReportId(int tblMedicalReportId) {
        this.tblMedicalReportId = tblMedicalReportId;
    }

    public int getTblBillId() {
        return tblBillId;
    }

    public void setTblBillId(int tblBillId) {
        this.tblBillId = tblBillId;
    }
    
    
}
