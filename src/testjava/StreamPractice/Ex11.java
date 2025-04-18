package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex11 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("An", 8.5),
                new Student("Binh", 7.2),
                new Student("Cuong", 5.5),
                new Student("Duc", 6.8),
                new Student("Em", 9.0)
        );
        students.stream().collect(Collectors.groupingBy(student -> {
            if (student.score >= 8.0) {
                return "Giỏi";
            } else if (student.score >= 6.5) {
                return "Khá";
            } else {
                return "Trung bình";
            }
        }, Collectors.averagingDouble(student -> student.score))).forEach((group, score) -> {
            System.out.println("Nhóm học sinh " + group + " có điểm trung bình là " + score);
        });
    }
}
