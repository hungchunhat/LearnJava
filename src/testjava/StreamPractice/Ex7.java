package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("An", 8.5),
                new Student("Binh", 7.2),
                new Student("Cuong", 5.5),
                new Student("Duc", 6.8),
                new Student("Em", 9.0)
        );
        students.stream().collect(Collectors.groupingBy(student ->{
            if(student.score >= 8.0){
                return "Excellent";
            } else if (student.score >= 6.5) {
                return "Good";
            } else{
                return "Bad";
            }
        },Collectors.toList())).forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
