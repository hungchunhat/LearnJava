package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apricot", "blueberry", "avocado", "blackberry");
        words.stream().collect(Collectors.groupingBy(c -> c.charAt(0))).forEach((k, v) -> System.out.println(k + " " + v));

    }
}
