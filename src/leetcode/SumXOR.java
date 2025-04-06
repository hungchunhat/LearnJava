package leetcode;

import java.util.Scanner;

public class SumXOR {
    public static int sumXOR(int[] a) {
        int result = 0;
        int n = a.length;
        int size = 1 << n;
        for (int mask = 0; mask < size ; mask++) {
            int xorSum = 0;
            for (int i = 0; i < n; i++) {
                if((mask & (1<<i)) != 0){
                    xorSum ^= a[i];
                }
            }
            result += xorSum;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Bạn muốn mảng có bao nhiêu phần tử: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.println(sumXOR(a));
    }
}
