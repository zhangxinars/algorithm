package com.zhangxin.algorithm.demo.other.sort;

/**
 * 冒泡排序
 * @Author zhangxin
 * @Date 2021/1/29 1:31 下午
 */
public class BubblingSort {
    public static void main(String[] args) {
        int[] arr = {2,3,73,9,5,6,22,87,332,99};
        SortUnit.printArray(arr);
        sort(arr);
        SortUnit.printArray(arr);
    }

    private static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i< N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    SortUnit.swap(arr, j, j+1);
                }
            }
        }
    }
}
