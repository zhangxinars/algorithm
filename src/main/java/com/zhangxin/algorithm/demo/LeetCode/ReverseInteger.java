package com.zhangxin.algorithm.demo.LeetCode;

/**
 * easy
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 *
 */
public class ReverseInteger {
    private static int reverse(int x) {
        try {
            String xStr = x + "";
            StringBuilder xStrBuilder = new StringBuilder(xStr);
            String resultStr = xStrBuilder.reverse().toString();
            if(x > 0){
                return Integer.parseInt(resultStr);
            }else{
                return -Integer.parseInt(resultStr.replace("-",""));
            }
        }catch(Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
