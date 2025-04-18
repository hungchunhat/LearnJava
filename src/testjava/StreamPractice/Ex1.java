package testjava.StreamPractice;

import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = numbers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(numbers2);
    }
}
