package Model;

/**
 * The SinhVien class represents a student with various attributes such as name, gender, date of birth,
 * phone number, hometown
 */
public class SinhVien {
    protected String msv;
    protected String hoTen;
    protected String gioiTinh;
    protected String ngaySinh;
    protected String sdt;
    protected String queQuan;
    
    @Override
    public String toString() {
        return "SinhVien [msv=" + msv + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
                + ", sdt=" + sdt + ", queQuan=" + queQuan + "]";
    }

    public SinhVien(String msv, String hoTen, String gioiTinh, String ngaySinh, String sdt, String queQuan) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.queQuan = queQuan;
    }

    public SinhVien() {
    }
    
    public String getMsv() {
        return msv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public String getSdt() {
        return sdt;
    }
    public String getQueQuan() {
        return queQuan;
    }
    public void setMsv(String msv) {
        this.msv = msv;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}