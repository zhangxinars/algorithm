package com.zhangxin.algorithm.demo.LeetCode;

/**
 * easy
 *
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 */
public class Pow {
    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        double temp = myPow(x, n/2);

        if (n % 2 == 0) {
            return temp*temp;
        } else {
            return n > 0 ? temp * temp * x : temp * temp * (1/x);
        }
    }

    public static void main(String[] args) {
        double result = myPow(2,3);
        System.out.println(result);
    }
}
