package leetcode;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public boolean isHappy(int n) {
        int x = n;
        Map<Integer, Integer> map = new HashMap<>();
        while(true) {
            int sum = 0;
            while(x > 0) {
                sum += (x % 10) * (x % 10);
                x /= 10;
            }
            if(map.containsKey(sum)) {
                return false;
            }
            map.put(sum,0);
            if(sum == 1) {
                return true;
            }
            x = sum;
        }
    }
    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(3));
    }
}
