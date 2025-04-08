package leetcode;

import java.util.*;

public class MinimumOperator {
    public static int minimumOperator(int[] nums) {
        int[] map = new int[100];
        for (int i = nums.length-1; i >=0; i--) {
            if(++map[nums[i]] > 1) return (i+3)/3;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 3, 5, 7};
        int[] arr1 = new int[10];
        System.out.println(minimumOperator(arr));
    }
}
