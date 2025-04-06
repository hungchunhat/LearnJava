package lab3;

import java.util.Scanner;

/*Nhập vào một số nguyên tố từ bàn phím kiểm tra xem có phải số nguyên tố*/
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra số nguyên tố");
        System.out.print("Nhập vào một số bất kì: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n < 0){
            System.out.println("Số của bạn bé hơn 0? Bạn có bị ngu không?");
            return;
        }
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                System.out.println("Đây không phải số nguyên tố");
                return;//System.exit(0) mạnh hơn return
            }
        }
        System.out.printf("%d là số nguyên tố",n);
    }
}
