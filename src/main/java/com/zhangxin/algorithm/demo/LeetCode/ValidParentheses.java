package com.zhangxin.algorithm.demo.LeetCode;

import java.util.ArrayList;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1.Open brackets must be closed by the same type of brackets.
 * 2.Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 *
 */
public class ValidParentheses {

    private static boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }else {
            int length;

            do {
                length = s.length();
                s = s.replace("()", "").replace("{}", "").replace("[]", "");
            } while(length != s.length());

            return s.length() == 0;
        }
    }

    private static boolean isValid2(String s){
        if (s.length() % 2 != 0) return false;
        ArrayList<Character> stack = new ArrayList<Character>();
        int len = s.length();
        int size = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(c);
                size++;
            } else if (c == '[') {
                stack.add(c);
                size++;
            } else if (c == '{') {
                stack.add(c);
                size++;
            } else if (c == ')') {
                if (size == 0 || stack.remove(size-1) != '(') return false;
                size--;
            } else if (c == ']') {
                if (size == 0 || stack.remove(size-1) != '[') return false;
                size--;
            } else if (c == '}') {
                if (size == 0 || stack.remove(size-1) != '{') return false;
                size--;
            }
        }
        if (size > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid2("[([([([([()])])])])]"));
    }
}
