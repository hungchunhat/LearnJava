package Thread;

public class test1 extends Thread {
    public void run() {
        long sum = 0L;
        for (long i = 0; i < 1000000000L; i++) {
            sum += i;
        }
        System.out.println("end thread");
    }

    public static void main(String[] args) {
        int MAX = 2;
        for (int i = 0; i < MAX; i++) {
            new test1().start();
        }
        System.out.println("hello");
        for (int i = 0; i < MAX; i++) {
            runwithouthread();
        }
    }
    public static void runwithouthread(){
        long sum = 0L;
        for (long i = 0; i < 1000000000L; i++) {
            sum += i;
        }
        System.out.println("end no thread");
    }
}
