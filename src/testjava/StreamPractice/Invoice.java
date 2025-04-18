package testjava.StreamPractice;

public class Invoice {
    int id;
    double amount;
    Invoice(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }
    public String toString() {
        return "ID: " + id + ", Amount: " + amount;
    }
}
