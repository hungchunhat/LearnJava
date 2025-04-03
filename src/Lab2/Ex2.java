package Lab2;
/*ax^2 + bx + c = 0
* Nhập vào 3 số a,b và c
* Tính toán nghiệm của phương trình*/

import java.util.Scanner;

public class Ex2 {
    public static void PTB2(int a, int b, int c) {
        if(a == 0){
            Ex1.PTB1(b,c);
        }
        else{
            int delta = b*b - 4*a*c;
            if(delta == 0){
                System.out.printf("Phương trình có nghiệm kép: x = %.2f",(-b*1.0)/(2*a));
            } else if (delta > 0) {
                System.out.println("Phương trình có nghiệm 2 nghiệm phân biệt:");
                System.out.printf("x1 = %.2f\n",(-b + Math.sqrt(delta))/(2*a));
                System.out.printf("x2 = %.2f\n",(-b - Math.sqrt(delta))/(2*a));
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập vào 3 số a,b và c");
        System.out.print("a = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        PTB2(a,b,c);
        sc.close();
    }
}
