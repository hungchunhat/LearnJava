package testjava.StreamPractice;

public class Student {
    String name;
    double score;
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }
}
