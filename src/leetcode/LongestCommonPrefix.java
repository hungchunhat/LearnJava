package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < (Math.min(first.length(), last.length())); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return prefix.toString();
            }
            prefix.append(first.charAt(i));
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String strTest = "Hello, World";
        System.out.println(strTest.substring(7));//[)
        String[] strs1 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
