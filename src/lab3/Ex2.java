package lab3;

import java.util.Scanner;

/*
 * Viết bảng cửu chương của một số bất kì*/
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Chương trình bảng cửu chương của số bất kì");
        System.out.print("Nhập vào số mà bạn muốn tôi lập bảng cửu chương: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
