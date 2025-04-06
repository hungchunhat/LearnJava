package lab2;

import java.util.Scanner;

/* ax + b = 0
* Nhập vào 2 số nguyên a và b
* Tính toán nghiệm của phương trình trên*/
public class Ex1 {
    public static void PTB1(int a, int b) {
        if(a == 0){
            System.out.println("Phương trình vô nghiệm");
        }
        else{
            System.out.printf("Nghiệm của hệ phương trình là: %.2f",(float)-b/a);
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập vào 2 số a và b:");
        System.out.print("a = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        PTB1(a,b);
        sc.close();
    }
}
