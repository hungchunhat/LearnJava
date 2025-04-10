package leetcode;

import java.util.Arrays;

public class RemoveElement {
    public RemoveElement(){}
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length-1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == val && i == n){
                count++;
                n--;
            }else if(nums[i] == val){
                count ++;
                nums[i] = nums[n];
                n--;
            }
        }
        return nums.length - count;
    }
    public static void main(String[] args) {
        int val = 3;
        int[] a = {3,2,2,3};
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(a, val));
    }
}
