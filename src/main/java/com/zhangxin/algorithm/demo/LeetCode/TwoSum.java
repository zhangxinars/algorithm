package com.zhangxin.algorithm.demo.LeetCode;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int sum;
        int[] list = new int[2];
        for (int a = 0; a < nums.length - 1; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                sum = nums[a] + nums[b];

                if (sum == target) {
                    list[0] = a;
                    list[1] = b;
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
    }
}
