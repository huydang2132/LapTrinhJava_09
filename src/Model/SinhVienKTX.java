package Model;
import Model.SinhVien;
public class SinhVienKTX extends SinhVien {
    // private String sdt;
    private String ngayDangKy;
    private String ngayHetHan;

    public SinhVienKTX() {}

    public SinhVienKTX(String msv, String hoTen, String gioiTinh, String ngaySinh, String sdt, String queQuan,
            String ngayDangKy, String ngayHetHan) {
        super(msv, hoTen, gioiTinh, ngaySinh, queQuan);
        this.ngayDangKy = ngayDangKy;
        this.ngayHetHan = ngayHetHan;
    }

    public SinhVienKTX(String ngayDangKy, String ngayHetHan) {
        this.ngayDangKy = ngayDangKy;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }
    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }
    public String getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s, %s\n", masv, hoten, ngaysinh, gioitinh, quequan, ngayDangKy, ngayHetHan);
    }
}
