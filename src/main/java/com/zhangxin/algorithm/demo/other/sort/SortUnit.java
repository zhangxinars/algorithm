package com.zhangxin.algorithm.demo.other.sort;

import java.util.Arrays;

/**
 * @Author zhangxin
 * @Date 2021/1/29 1:31 下午
 */
public class SortUnit {
    /**
     * 打印数组
     * @param arr
     */
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 数组中两个数字交换
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 生成随机数组
     * @param maxSize 最大长度
     * @param maxValue 值范围（绝对值）
     * @return 生成的随机数组
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }
}
