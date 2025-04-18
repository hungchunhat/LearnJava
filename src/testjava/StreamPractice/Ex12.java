package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex12 {
    public static void main(String[] args) {
        List<Invoice> invoices = List.of(
                new Invoice(1, 120.0),
                new Invoice(2, 80.0),
                new Invoice(3, 150.0),
                new Invoice(4, 90.0),
                new Invoice(5, 200.0)
        );
        invoices.stream().collect(Collectors.partitioningBy(invoice -> invoice.amount > 100.0)).forEach((k,v)-> System.out.printf("%b:\t %s\n" ,k,v));
    }
}
