package Hust;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Nhập số h: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        while (h < 2 || h > 10) {
            System.out.print("Nhập lại số h (2<=h<=10): ");
            h = sc.nextInt();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= 2 * (h - 1); j++) {
                if (j >= h - i - 1 && j <= h + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
