package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0)).forEach((k,v)->System.out.println(k+":"+v));
    }
}
