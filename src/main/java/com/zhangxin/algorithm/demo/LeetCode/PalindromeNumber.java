package com.zhangxin.algorithm.demo.LeetCode;

/**
 * easy
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        try {
            if(x < 0){
                return false;
            }
            String xStr = x + "";
            StringBuilder xStrBuilder = new StringBuilder(xStr);
            String resultStr = xStrBuilder.reverse().toString();
            int y = 0;
            if(x > 0){
                y = Integer.parseInt(resultStr);
            }
            return x - y == 0;
        }catch(Exception e){
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(120));
    }
}
