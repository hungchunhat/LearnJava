package Hust.Inheritance.Ex4;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong() {
    }

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong, LUONG_MAX);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() * getHeSoLuong() + getPhuCap();
    }

    public static void main(String[] args) {
        TruongPhong t1 = new TruongPhong();
        TruongPhong t2 = new TruongPhong("Hehe", 40000, 1.75, 100000, 10000, 10);
        System.out.println(t2.tinhLuong());
    }
}
