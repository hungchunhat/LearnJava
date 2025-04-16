package leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2; // ways(1) = 1, ways(2) = 2
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }


    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(4));
    }
}
