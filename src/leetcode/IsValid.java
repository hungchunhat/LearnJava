package leetcode;

import java.util.Stack;

public class IsValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == ')') {
                if (stack.isEmpty()){
                    return false;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            } else if (aChar == '}') {
                if (stack.isEmpty()){
                    return false;
                } else {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            } else if (aChar == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            } else {
                stack.push(aChar);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s ="(])";
        System.out.println(isValid(s));
    }
}