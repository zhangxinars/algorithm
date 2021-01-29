package com.zhangxin.algorithm.demo.other.sort;

/**
 * 插入排序
 * @Author zhangxin
 * @Date 2021/1/29 2:51 下午
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2,3,73,9,5,6,22,87,332,99};
        SortUnit.printArray(arr);
        sort2(arr);
        SortUnit.printArray(arr);
    }

    private static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            int newNumIndex = i;
            while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                SortUnit.swap(arr, newNumIndex, newNumIndex - 1);
                newNumIndex--;
            }
        }
    }

    private static void sort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            for (int pre = end -1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                SortUnit.swap(arr, pre, pre + 1);
            }
        }
    }
}
