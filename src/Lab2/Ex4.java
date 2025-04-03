package Lab2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(">>       Lựa chọn tính năng       <<");
        System.out.println("++ ------------------------------ ++");
        System.out.println("| 1. Giải hệ phương trình bậc nhất |");
        System.out.println("| 2. Giải hệ phương trình bậc hai  |");
        System.out.println("| 3. Tính số tiền điện             |");
        System.out.println("++ ------------------------------ ++");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            Ex1.main(args);
        }
        else if(a==2){
            Ex2.main(args);
        }else if(a==3){
            Ex3.main(args);
        }
        sc.close();
    }
}
