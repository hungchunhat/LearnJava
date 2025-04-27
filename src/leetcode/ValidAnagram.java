package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }
    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }
}
