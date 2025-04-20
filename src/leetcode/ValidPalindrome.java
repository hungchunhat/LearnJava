package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int start = 0, end = s.length() - 1;
        while(start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) start++;
            else if(!Character.isLetterOrDigit(s.charAt(end))) end--;
            else {
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "0P";
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome(s1));
    }
}
