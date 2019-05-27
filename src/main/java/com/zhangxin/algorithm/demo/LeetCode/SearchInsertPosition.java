package com.zhangxin.algorithm.demo.LeetCode;

import java.util.ArrayList;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition {
    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
     * Memory Usage: 38.6 MB, less than 94.57% of Java online submissions for Search Insert Position.
     * @param nums
     * @param target
     * @return
     */
    private static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            if(nums[(start + end)/2] < target){
                start = (start + end)/2 + 1;
            }else {
                end = (start + end)/2 - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 5));
    }
}
