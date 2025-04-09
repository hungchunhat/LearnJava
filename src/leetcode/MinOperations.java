package leetcode;

import java.util.Arrays;
public class MinOperations {
    public int findDistinct(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(k > nums[0]){
            return -1;
        }else{
            if (k == nums[0]){
                return findDistinct(nums);
            }
            else {
                return findDistinct(nums) + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,2,5,4,5};
        int k = 2;
        MinOperations m = new MinOperations();
        System.out.println(m.minOperations(nums, k));
    }
}
