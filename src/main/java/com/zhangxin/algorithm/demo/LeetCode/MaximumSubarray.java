package com.zhangxin.algorithm.demo.LeetCode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {
    static class Info{                   //Wrapper used for passing reference of primitive variables
        int max_sum_from_left;           //the largest sum of continguous subarray starting from the leftmost position
        int max_sum_from_right;          //the largest sum of continguous subarray starting from the rightmost position
        int sum_all;                     //the sum over all the array
        int max_sum;                     //current larget sum of any contiguous array
    }

    private static void maxSubArrayHelper(int[] nums, int left, int right, Info info)
    {
        if(left == right){
            info.max_sum_from_left = nums[left];
            info.max_sum_from_right  = nums[left];
            info.sum_all = nums[left];
            info.max_sum = nums[left];
            return;
        }

        int middle = (left + right) / 2;
        Info info1 = new Info();
        Info info2 = new Info();
        maxSubArrayHelper(nums, left, middle, info1);
        maxSubArrayHelper(nums, middle + 1, right, info2);

        info.max_sum_from_left = Math.max(info1.max_sum_from_left, info1.sum_all + info2.max_sum_from_left);
        info.max_sum_from_right = Math.max(info2.max_sum_from_right, info2.sum_all + info1.max_sum_from_right);
        info.sum_all = info1.sum_all + info2.sum_all;
        info.max_sum = Math.max(info1.max_sum, info2.max_sum);
        info.max_sum = Math.max(info.max_sum, info1.max_sum_from_right + info2.max_sum_from_left);
    }

    private static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        Info info = new Info();
        info.max_sum = Integer.MIN_VALUE;
        maxSubArrayHelper(nums, 0, nums.length - 1, info);
        return info.max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}