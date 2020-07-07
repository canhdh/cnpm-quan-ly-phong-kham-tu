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
public class RequiredTest implements Serializable{
    public ArrayList<RequiredTest> asArrayList() {
      ArrayList<RequiredTest> requiredTests = new ArrayList<>();
      requiredTests.add(this);
      return requiredTests;
    };
}
