package com.zhangxin.algorithm.demo.LeetCode;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 */
public class ImplementStrStr {
    /**
     * Runtime: 5 ms, faster than 28.03% of Java online submissions for Implement strStr().
     * Memory Usage: 36.9 MB, less than 98.39% of Java online submissions for Implement strStr().
     * @param haystack
     * @param needle
     * @return
     */
    private static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == haystack.replace(needle,"").length()){
            return -1;
        }else {
            int index = 0;
            for(int i = 0; i < haystack.length(); i++){
                while (!haystack.startsWith(needle)) {
                    haystack = haystack.substring(1);
                    index++;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
