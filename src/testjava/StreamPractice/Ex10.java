package testjava.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("An", 16),
            new Person("Bình", 22),
            new Person("Cường", 35),
            new Person("Dung", 28),
            new Person("Em", 12)
        );
        people.stream().collect(Collectors.groupingBy(person ->{
            if(person.age  < 18){
                return "Trẻ";
            }else if(person.age < 30){
                return "Thanh niên";
            }else{
                return "Trung niên";
            }
        },Collectors.counting())).forEach((k,v)->System.out.printf("%10s: %d\n",k,v));
    }
}
