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
public class Room implements Serializable{
    
    private int id;
    private String name;
    private String type;
    private double price;
    private String description;
    private String location;
    private int status;
    private int clinicId;

    public Room() {
        super();
    }

    public Room(String name, String type, double price, String description, String location, int status, int clinicId) {
        super();
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
        this.location = location;
        this.status = status;
        this.clinicId = clinicId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }
    
    
}
