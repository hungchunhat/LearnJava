package lab1;

import java.util.Scanner;

//nhap ten sinh vien ĐTB từ bàn phím
/*In ra màn hinh với định dạng
 * <tên sinh viên> có điểm = <điểm>*/
public class Lab1Practice {
    public static void main(String[] args) {
        System.out.print("Enter the Student's name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter Student's average mark: ");
        float mark = sc.nextFloat();
        System.out.println(name + " có điểm = " + mark);
        sc.close();
    }
}
