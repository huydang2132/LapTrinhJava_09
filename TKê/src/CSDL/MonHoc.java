/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MonHoc implements Serializable {
    private String Mon;

    public MonHoc() {
    }
    public MonHoc(String Mon) {
        this.Mon=Mon;
    }
    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }
    
}
