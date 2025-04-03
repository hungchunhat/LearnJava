package Lab2;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.println(">>Lựa chọn tính năng<<");
        System.out.println("++ ---------------- ++");
        System.out.println("| 1. Cộng            |");
        System.out.println("| 2. Trừ             |");
        System.out.println("| 3. Kết thúc        |");
        System.out.println("++ ---------------- ++");
        System.out.print("Lựa chọn của bạn là: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Phép cộng");
                break;
            case 2:
                System.out.println("Phép trừ");
                break;
            case 3:
                System.out.println("Thoát chương trình");
                System.exit(0);
                break;
            default:
                System.out.println("Địt mẹ thằng ngu");
        }
        sc.close();
    }
}
