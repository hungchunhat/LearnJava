package Hust.Inheritance.Ex2;

public class TestNV {
    public static void main(String[] args) {
        NhanVien v = new NhanVien("Hưng Thái",10000,1.0,20000);
        NhanVien v2 = new NhanVien("Long Đơ",11000,1.25,30000);
        NhanVien[] nv = {v,v2};
        System.out.println(sumSalary(nv));
        v.display();
        v2.display();
        v.increaseSalary(0.9);
        v2.increaseSalary(1.1);
        v.display();
        v2.display();
        System.out.println(sumSalary(nv));
    }
    public static double sumSalary(NhanVien[] nv) {
        return nv[0].calculateSalary() + nv[1].calculateSalary();
    }
}
