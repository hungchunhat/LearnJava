package leetcode;

import java.util.Arrays;

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
*/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = new int[]{3,2,3};
        System.out.println(majorityElement.majorityElement(nums));
    }
}
