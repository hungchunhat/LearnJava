package leetcode;

public class CountSymmetricIntegers {
    public static boolean isEvenDigit(int number) {
        String s = String.valueOf(number);
        return s.length() % 2 == 0;
    }
    public static boolean isSymmetric(int number) {
        if(!isEvenDigit(number)){
            return false;
        }
        String s = String.valueOf(number);
        char sum1 = 0, sum2 = 0;
        for (int i = 0; i < s.length()/2; i++) {
            sum1 += s.charAt(i);
            sum2 += s.charAt(s.length()-1-i);
        }
        return sum1 == sum2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if(isSymmetric(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int low = 1;
        int high = 100;
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        System.out.println(solution.countSymmetricIntegers(low, high));
    }
}
