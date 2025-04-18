package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "apple", "banana", "kiwi", "pear", "elephant");
        words.stream().collect(Collectors.groupingBy(String::length)).forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
