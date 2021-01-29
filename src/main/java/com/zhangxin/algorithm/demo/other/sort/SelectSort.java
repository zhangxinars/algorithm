package com.zhangxin.algorithm.demo.other.sort;

import com.zhangxin.algorithm.demo.other.Sort;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;

/**
 * 选择排序
 * @Author zhangxin
 * @Date 2021/1/29 1:00 下午
 */
public class SelectSort {


    public static void main(String[] args) {
        int[] arr = {2,3,73,9,5,6,22,87,332,99};
        SortUnit.printArray(arr);
        sort(arr);
        SortUnit.printArray(arr);
    }


    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i< N; i++) {
            int minIndex = i;
            // 循环找到最小坐标
            for (int j = i + 1; j < N; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            // 将i（应该的最小位置）与找到的最小值坐标交互
            SortUnit.swap(arr, i, minIndex);
        }
    }

}
