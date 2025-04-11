package Hust.Inheritance.Ex2;


public class NhanVien {
    private String name;
    private double basicSalary;
    private double salaryRate;
    public double maxSalary;

    public NhanVien() {
    }

    public NhanVien(String name, double basicSalary, double salaryRate, double maxSalary) {
        setName(name);
        setBasicSalary(basicSalary);
        setSalaryRate(salaryRate);
        setMaxSalary(maxSalary);
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public boolean increaseSalary(double salary) {
        double newRate = getSalaryRate() + salary;
        if (getBasicSalary() * newRate > maxSalary) {
            System.out.println("Salary exceeds max salary");
            return false;
        } else {
            setSalaryRate(newRate);
            return true;
        }
    }

    public double calculateSalary() {
        return getBasicSalary() * getSalaryRate();
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + getName() + '\'' +
                ", basicSalary=" + getBasicSalary() +
                ", salaryRate=" + getSalaryRate() +
                ", CurrentSalary=" + calculateSalary() +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
