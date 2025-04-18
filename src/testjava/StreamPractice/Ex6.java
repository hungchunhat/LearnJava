package testjava.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<String> lines = List.of("java is cool", "cool code in java", "i love java");
        lines.stream().flatMap(line -> Arrays.stream(line.split(" "))).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting())).forEach((k,v)->System.out.println(k+": "+v));
    }
}
