/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author Đặng Huy
 */
public class SINHVIEN {
    private String masv;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String quequan;

    public SINHVIEN() {
    }

    public SINHVIEN(String masv, String hoten, String ngaysinh, String gioitinh, String quequan) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", masv, hoten, ngaysinh, gioitinh, quequan);
    }
    
}
