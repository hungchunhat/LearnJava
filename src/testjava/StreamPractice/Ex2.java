package testjava.StreamPractice;

import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> names = List.of("alice", "bob", "charlie", "david");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
