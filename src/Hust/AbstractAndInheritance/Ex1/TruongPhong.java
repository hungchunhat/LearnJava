package Hust.AbstractAndInheritance.Ex1;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong() {
    }

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong, LUONG_MAX);
        setSoNamDuongChuc(soNamDuongChuc);
        setPhuCap(phuCap);
    }

    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + getPhuCap();
    }

    @Override
    public String toString() {
        return super.toString() + "\n--Số Năm Đương Chức: " + getSoNamDuongChuc()
                                + "\n--Phụ Cấp: " + getPhuCap();
    }

    @Override
    public void inTTin() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
        NhanVien truongPhong = new TruongPhong("Hưng Thái", 100000, 1.25, 1000000, 20000, 20);
        System.out.println(truongPhong);
    }
}
