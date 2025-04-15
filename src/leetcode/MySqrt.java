package leetcode;

public class MySqrt {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int left = 1, right = x, mid;
        while(left <= right) {
            mid = left + (right-left) / 2;//(left + right)/2 -> tràn số
            if(mid * mid == x) {
                return mid;
            }else if((long)mid * mid > x) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(Integer.MAX_VALUE));
    }
}
