/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.model;

import java.io.Serializable;

/**
 *
 * @author Dang Huu Canh
 */
public class Room implements Serializable {
    
    private int id;
    private String name;
    private String type;
    private String location;
    private String description;    
    private double price;
    private int isActive;

    public Room() {
        super();
    }

    public Room(String name, String type, String location, String description, double price, int isActive) {
        super();
        this.name = name;
        this.type = type;
        this.location = location;
        this.description = description;
        this.price = price;
        this.isActive = isActive;
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

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    
}
