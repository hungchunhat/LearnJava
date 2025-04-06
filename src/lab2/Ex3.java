package lab2;

import java.util.Scanner;

/*
* Viết phương trình tính số tiền điện
* Nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau
* 0->100 giá mỗi số điện là 1000
* >100 giá mỗi số là 1500*/
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số điện: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>100){
            System.out.println("Số tiền bạn cần trả là (100đ/1số):"+ (1500*(n-100)+1000*100));
        }else {
            System.out.println("Số tiền bạn cần trả là (100đ/1số):"+ 1000*n);
        }
        sc.close();
    }
}
