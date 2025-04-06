package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
*
Symbol        Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
* */
public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i = 0; i < s.length()-1; i++) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                result += map.get(s.charAt(i));
            }else {
                result -= map.get(s.charAt(i));
            }
        }
        result += map.get(s.charAt(s.length()-1));
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter your roman number: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(romanToInt(s));
    }
}
