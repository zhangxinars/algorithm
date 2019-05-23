package com.zhangxin.algorithm.demo.LeetCode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length != 0){
            result = strs[0];
        }

        for(int i = 0; i < strs.length; i++){
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
