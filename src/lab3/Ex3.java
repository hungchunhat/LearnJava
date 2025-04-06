package lab3;

import java.util.*;

/*Viết chương trình nhập vào một số nguyên bất kì
* Sắp xếp và xuất mảng vừa nhập ra màn hình
* Xuất phần tử min
* Xuất phần tử max */
public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập vào giá trị cho từng phần tử của mảng");
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        int max = a[0];
        System.out.println("Max là "+max);
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi được sắp xếp là: "+Arrays.toString(a));
        System.out.println("Min: "+ a[0]);
        System.out.println("Max: "+ a[n-1]);
    }
}
