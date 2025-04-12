package leetcode;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int target = 4;
        System.out.println(new SearchInsert().searchInsert(nums, target));
    }
}
