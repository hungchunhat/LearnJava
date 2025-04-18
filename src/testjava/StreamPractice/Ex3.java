package testjava.StreamPractice;

import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 35, 55, 60, 75, 20);
        int x = numbers.stream().filter(number -> number > 50).reduce(0,Integer::sum);
        System.out.println(x);
        //không sử dụng identity với reduce có được không?
    }
}
