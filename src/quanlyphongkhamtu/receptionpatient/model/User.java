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
public class User implements Serializable {
    
    private int id;
    private String username;
    private String password;
    private String name;
    private int age;
    private String address;
    private String hometown;
    private String phone;
    private String certificate;
    private String posititon;

    public User() {
        super();
    }

    public User(String username, String password, String name, int age, String address, String hometown, String phone, String certificate, String posititon) {
        super();
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.address = address;
        this.hometown = hometown;
        this.phone = phone;
        this.certificate = certificate;
        this.posititon = posititon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getPosititon() {
        return posititon;
    }

    public void setPosititon(String posititon) {
        this.posititon = posititon;
    }
    
    
}
