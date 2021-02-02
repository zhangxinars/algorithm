package com.zhangxin.algorithm.demo.leftGod;

import java.util.Arrays;

/**
 * KMP算法实例，String indexOf
 * @Author zhangxin
 * @Date 2021/2/2 9:24 下午
 */
public class StringIndexOf {
    public static void main(String[] args) {
        String str1 = "aaaaaaaaabc";
        String str2 = "aaaab";

        int result = stringIndexOf(str1, str2);
        System.out.println(result);


//        Arrays.stream(generateNextArray(str2.toCharArray())).forEach(value -> System.out.print(value + ","));
    }

    private static int stringIndexOf(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < 1 || str2.length() < 1 || str1.length() < str2.length()) {
            return -1;
        }
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int[] next = generateNextArray(s2);
//        Arrays.stream(next).forEach(value -> System.out.print(value + ","));

        int x = 0;
        int y = 0;
        while (x < str1.length() && y < str2.length()) {
            if (s1[x] == s2[y]) {
                x++;
                y++;
            } else if (next[y] == -1) {
                x++;
            } else {
                y = next[y];
            }
        }
        if(y == s2.length) {
            return x - y;
        }else {
            return -1;
        }
    }

    private static int[] generateNextArray(char[] s) {
        int [] next = new int[s.length];
        if (s.length == 1) {
            next[0] = -1;
            return new int[]{-1};
        }
        if (s.length == 2) {
            return new int[]{-1, 0};
        }

        int i = 2;
        int cn = 0;
        next[0] = -1;
        next[1] = 0;
        while (i < s.length) {
            cn = next[i - 1];
            if (s[i - 1] == s[next[i-1]]) {
                next[i] = ++cn;
            } else if (next[++cn] > 0) {
                cn = ++next[++cn];
            } else {
                next[i] = 0;
            }
            i++;
        }
        return next;
    }

    /**
     * todo 写一个对数器
     */

}
