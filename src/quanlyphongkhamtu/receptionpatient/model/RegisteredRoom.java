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
public class RegisteredRoom implements Serializable {
    
    private int id;
    private double total;
    private Instant registeredTime;
    private Patient patient;
    private Room room;
    private User user;

    public RegisteredRoom() {
        super();
    }

    public RegisteredRoom(double total, Instant registeredTime, Patient patient, Room room, User user) {
        this.total = total;
        this.registeredTime = registeredTime;
        this.patient = patient;
        this.room = room;
        this.user = user;
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

    public Instant getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(Instant registeredTime) {
        this.registeredTime = registeredTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public ArrayList<RegisteredRoom> asArrayList() {
      ArrayList<RegisteredRoom> registeredRooms = new ArrayList<>();
      registeredRooms.add(this);
      return registeredRooms;
    };
}
