package leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && count != 0) {
                break;
            }else if(s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World    ";
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.lengthOfLastWord(s));
    }
}
