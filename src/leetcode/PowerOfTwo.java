package leetcode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(15));
    }
}
