package com.zhangxin.algorithm.demo.other;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Sort {
    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSort() {
        int[] unordered = {34, 23, 44, 54, 18, 14, 343, 98, 1, 3, 78};
        int len = unordered.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                int temp;
                if (unordered[j] > unordered[j + 1]) {
                    temp = unordered[j];
                    unordered[j] = unordered[j + 1];
                    unordered[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(unordered));
    }

    /**
     * 选择排序
     */
    @Test
    public void selectionSort() {
        int[] unordered = {34, 23, 44, 54, 18, 14, 343, 98, 1, 3, 78};
        int len = unordered.length;

        int minIndex;
        int temp;
        for (int i = 0; i < len - 1; i++){
            minIndex = i;
            for(int j = i + 1; j < len; j++){
                if(unordered[j] < unordered[minIndex]){
                    minIndex = j;
                }
            }
            temp = unordered[i];
            unordered[i] = unordered[minIndex];
            unordered[minIndex] = temp;

        }
        System.out.println(Arrays.toString(unordered));
    }



}
