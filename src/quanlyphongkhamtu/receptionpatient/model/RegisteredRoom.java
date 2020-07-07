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
    private int tblRoomId;
    private int tblPatientId;
    private int tblBillId;

    public RegisteredRoom() {
        super();
    }

    public RegisteredRoom(Instant datetime, int tblRoomId, int tblPatientId, int tblBillId) {
        super();
        this.datetime = datetime;
        this.tblRoomId = tblRoomId;
        this.tblPatientId = tblPatientId;
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

    public int getTblBillId() {
        return tblBillId;
}

    public void setTblBillId(int tblBillId) {
        this.tblBillId = tblBillId;
    }
    
    
}
