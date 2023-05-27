/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable {
    private String MSV;
    private String Ten;
    private String GioiTinh;
    private String Khoa;
    private String SDT;
    private String Que;
    
    private double DiemA;
    private double DiemB;
    private double DiemC;
    private double DiemD;
    private double DiemE;
    
    public SinhVien(){
    
    }
    public SinhVien(String MSV, String Ten, String GioiTinh, String Khoa, String SDT, String Que, double DiemA, double DiemB, double DiemC, double DiemD, double DiemE) {
        this.MSV = MSV;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;

        this.SDT = SDT;
        this.Que = Que;
        this.DiemA = DiemA;
        this.DiemB = DiemB;
        this.DiemC = DiemC;
        this.DiemD = DiemD;
        this.DiemE = DiemE;
    }


    public String getMSV() {
        return MSV;
    }

    public String getTen() {
        return Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public String getQue() {
        return Que;
    }

    public double getDiemA() {
        return DiemA;
    }

    public double getDiemB() {
        return DiemB;
    }

    public double getDiemC() {
        return DiemC;
    }

    public double getDiemD() {
        return DiemD;
    }

    public double getDiemE() {
        return DiemE;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setQue(String Que) {
        this.Que = Que;
    }

    public void setDiemA(int DiemA) {
        this.DiemA = DiemA;
    }

    public void setDiemB(int DiemB) {
        this.DiemB = DiemB;
    }

    public void setDiemC(int DiemC) {
        this.DiemC = DiemC;
    }

    public void setDiemD(int DiemD) {
        this.DiemD = DiemD;
    }

    public void setDiemE(int DiemE) {
        this.DiemE = DiemE;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public int getAttribute(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
