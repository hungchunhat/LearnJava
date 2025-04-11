package Hust.Inheritance.Ex4;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public double LUONG_MAX;

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

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public double tinhLuong() {
        return getHeSoLuong() * getLuongCoBan();
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", luongCoBan=" + luongCoBan +
                ", LUONG_MAX=" + LUONG_MAX +
                '}';
    }
    public NhanVien() {}

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public boolean tangHeSoLuong(double heSo){
        double heSoMoi = getHeSoLuong() + heSo;
        if(getLuongCoBan()*heSoMoi > getLUONG_MAX()){
            return false;
        }else{
            setHeSoLuong(heSoMoi);
            return true;
        }
    }
}
