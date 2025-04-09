package Hust;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Nhập cạnh của hình vuông: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int value = 1;
        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
