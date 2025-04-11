package Hust.Inheritance.Ex4;

public class TruongPhong extends NhanVien {
    public double phuCap;
    public int soNamDuongChuc;
    public TruongPhong() {}
    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong, LUONG_MAX);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
}
