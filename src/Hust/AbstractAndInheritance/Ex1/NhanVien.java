package Hust.AbstractAndInheritance.Ex1;

public class NhanVien {
    protected String tenNhanVien;
    protected double luongCoBan;
    protected double heSoLuong;
    public double LUONG_MAX = 50000;

    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        setTenNhanVien(tenNhanVien);
        setLuongCoBan(luongCoBan);
        setHeSoLuong(heSoLuong);
        setLUONG_MAX(LUONG_MAX);
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public boolean tangHeSoLuong(double heSo) {
        double newRate = heSo + getHeSoLuong();
        if (newRate * getHeSoLuong() > getLUONG_MAX()) {
            return false;
        }
        setHeSoLuong(newRate);
        return true;
    }

    public double tinhLuong() {
        return getHeSoLuong() * getLuongCoBan();
    }

    @Override
    public String toString() {
        return "Nhân Viên " + getTenNhanVien() + ":"
                + "\n--Lương Cơ Bản: " + getLuongCoBan()
                + "\n--Hệ Số Lương: " + getHeSoLuong()
                + "\n--Lương Hiện Tại:" + tinhLuong();
    }

    public void inTTin() {
        System.out.println(this);
    }
}
