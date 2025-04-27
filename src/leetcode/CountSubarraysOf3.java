package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountSubarraysOf3 {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] - nums[i+1]*1.0/2 + nums[i+2] == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-4,-1,4};
        System.out.println(new CountSubarraysOf3().countSubarrays(arr));
    }
}
