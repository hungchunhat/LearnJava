package testjava.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        List<String> strings = List.of("java", "stream", "lambda", "map", "reduce");
        List<String> sentences = List.of(
                "I love Java",
                "Streams are powerful",
                "flatMap is useful"
        );
        sentences.stream().map(sentence -> sentence.split(" ")).forEach(sentence -> System.out.println(Arrays.toString(sentence)));
        sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(""))).forEach(System.out::println);
        Map<String,Long> map = strings.stream().flatMap(string -> Arrays.stream(string.split(""))).collect(Collectors.groupingBy(c->c,
                Collectors.counting()));
        System.out.println(map);
        List<String> names = List.of("An", "Linh", "Tuan", "Nam", "Hoa", "Minh");
        names.stream().collect(Collectors.groupingBy(String::length)).forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
