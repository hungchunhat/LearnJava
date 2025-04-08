package Hust;

import java.util.Arrays;
import java.util.Random;


public class Ex1 {
    public static void randomSwap(int[] nums) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(nums.length);
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] nums = new int[10];
        Random r = new Random();
        for(int i = 0; i< nums.length;i++){
            nums[i] = r.nextInt(0,10);
        }
        System.out.println(Arrays.toString(nums));
        randomSwap(nums);
        System.out.println(Arrays.toString(nums));

    }
}
