package com.zhangxin.algorithm.demo.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * easy
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 */
public class RomanToInteger {

    private static int romanToInt(String s) {
        Map<String, Integer> symbolValueMap = new HashMap();
        symbolValueMap.put("I", 1);
        symbolValueMap.put("V", 5);
        symbolValueMap.put("X", 10);
        symbolValueMap.put("L", 50);
        symbolValueMap.put("C", 100);
        symbolValueMap.put("D", 500);
        symbolValueMap.put("M", 1000);

        int result = 0;
        int temp = 0;
        char[] sArray = s.toCharArray();
        for (int i = sArray.length - 1; i >= 0; i--) {
            String iNumIndex = String.valueOf(sArray[i]);
            int iNum = symbolValueMap.get(iNumIndex);

            if (temp <= iNum) {
                result += iNum;
                temp = iNum;
            } else {
                result -= iNum;
                temp = iNum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
