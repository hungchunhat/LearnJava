package Hust.Inheritance.Ex3;

public class StringPerformance {
    public static void main(String[] args) {
        int loop = 10000;
        long time1 = System.currentTimeMillis();
        String str = new String("hello world");
        for (int i = 0; i < loop; i++) {
            str += i;
        }
        long time2 = System.currentTimeMillis();
        System.out.println("StringPerformance: " + (time2 - time1) + " ms");
        StringBuffer sb = new StringBuffer("hello world");
        for (int i = 0; i < loop; i++) {
            sb.append(i);
        }
        long time3 = System.currentTimeMillis();
        System.out.println("StringPerformance: " + (time3 - time2) + " ms");
    }
}
