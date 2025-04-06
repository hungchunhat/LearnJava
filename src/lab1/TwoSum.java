package lab1;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.printf("The divide by %.0f is %d", Math.pow(2, b),(a >> b));
        sc.close();
        //sau khi dùng một thư viện xong thì nên đóng lại để tiết kiệm khoong gian bộ nhớ
    }
}
