package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinOperations {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        boolean check = false;
        for (int num : nums) {
            if (num < k) {
                return -1;
            } else if (num == k) {
                check = true;
                set.add(num);
            } else {
                set.add(num);
            }
        }
        if(check){
            return set.size()-1;
        }else{
            return set.size();
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,2,5,4,5};
        int k = 2;
        MinOperations m = new MinOperations();
        System.out.println(m.minOperations(nums, k));
    }
}
