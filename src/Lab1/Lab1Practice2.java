package Lab1;

import java.util.Scanner;

public class Lab1Practice2 {
    public static void main(String[] args) {
        System.out.print("Enter width: ");
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat();
        System.out.print("Enter length: ");
        float length = sc.nextFloat();
        System.out.println("Perimeter is " + (width+length)*2);
        System.out.println("Area is " + width*length);
        System.out.println("Min is " + Math.min(width, length));
        sc.close();
    }
}
