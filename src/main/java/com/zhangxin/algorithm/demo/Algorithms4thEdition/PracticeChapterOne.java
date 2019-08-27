package com.zhangxin.algorithm.demo.Algorithms4thEdition;

import com.zhangxin.algorithm.demo.Algorithms4thEdition.Std.StdOut;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

public class PracticeChapterOne {
    /**
     * 1.1.1
     * 给出以下表达式的值:
     * a. ( 0 + 15 ) / 2
     * b. 2.0e-6 * 100000000.1
     * c. true && false || true && true
     * <p>
     * 7
     * 200.0000002
     * true
     */
    @Test
    public void practice111() {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }

    /**
     * 1.1.2 给出以下表达式的类型和值:
     * a. (1 + 2.236)/2
     * b. 1 + 2 + 3 + 4.0
     * c. 4.1 >= 4
     * d. 1 + 2 + "3"
     * <p>
     * 1.618  浮点型
     * 10.0   浮点型
     * true   布尔型
     * 33     字符串
     */
    @Test
    public void practice112() {
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }

    /**
     * 1.1.3 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。
     */
    public static void practice113() {
        System.out.println("请输入三个整数:");
        Scanner scanner1 = new Scanner(System.in);
        String string1 = scanner1.next();

        Scanner scanner2 = new Scanner(System.in);
        String string2 = scanner2.next();

        Scanner scanner3 = new Scanner(System.in);
        String string3 = scanner3.next();

        Integer a = Integer.parseInt(string1);
        Integer b = Integer.parseInt(string2);
        Integer c = Integer.parseInt(string3);

        if (a.equals(b) && b.equals(c) && a.equals(c)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    /**
     * 1.1.4 下列语句各有什么问题(如果有的话)?
     * a. if (a > b) then c = 0;           Java无then关键字
     * b. if a > b { c = 0; }              a > b应该用()包起来
     * c. if (a > b) c = 0;                无问题
     * d. if (a > b) c = 0 else b = 0;     缺少分号和花括号
     */
    public void practice114(){
        int a = 0;
        int b = 1;
        int c;
        if (a > b) c = 0;
    }

    /**
     * 1.1.5 编写一段程序，如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true，否则打印 false。
     */
    @Test
    public void practice115() {
        double x = 0.1;
        double y = 0.5;
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * 1.1.6 下面这段程序会打印出什么?
     *        int f = 0;
     *        int g = 1;
     *        for (int i = 0; i <= 15; i++)
     *        {
     *           StdOut.println(f);
     *           f = f + g;
     *           g = f - g;
     * }
     * 一个斐波那契数列
     */
    @Test
    public void practice116() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    /**
     * 1.1.7 分别给出以下代码段打印出的值:
     * a. double t = 9.0;
     * while (Math.abs(t - 9.0/t) > .001)
     *            t = (9.0/t + t) / 2.0;
     *         StdOut.printf("%.5f\n", t);
     *
     * b. int sum = 0;
     * for (int i = 1; i < 1000; i++)
     *            for (int j = 0; j < i; j++)
     *                sum++;
     *         StdOut.println(sum);
     *
     * c. int sum = 0;
     * for (int i = 1; i < 1000; i *= 2)
     *            for (int j = 0; j < 1000; j++)
     *                sum++;
     *         StdOut.println(sum);
     *
     * 3.00009
     * 499500
     * 10000
     */
    @Test
    public void practice117(){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum2++;
        StdOut.println(sum2);
    }

    /**
     * 1.1.8 下列语句会打印出什么结果?给出解释。
     * a. System.out.println('b');
     * b. System.out.println('b' + 'c');
     * c. System.out.println((char) ('a' + 4));
     *
     * b
     * 197
     * e
     */
    @Test
    public void practice118(){
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    /**
     * 1.1.9 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
     */
    @Test
    public void practice119(){
        int N = 100;
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }

    /**
     * 1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出行号和列号。
     */
    @Test
    public void practice1111(){
        boolean[][] a = {{true,false,true},{false,true,false},{true,true,true}};
        for(int i = 0; i < a.length; i++){
            boolean b[] = a[i];
            for(int j = 0; j < b.length; j++ ){
                String s = "";
                if(a[i][j]){
                    s = "*";
                }
                System.out.println("第" + (int)(i+1) + "行" + "第" + (int)(j+1) + "列:" + s);
            }
        }
    }

    /**
     * 1.1.12 以下代码段会打印出什么结果?
     * 0 1 2 3 4 5 6 7 8 9
     */
    @Test
    public void practice1112(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

    /**
     * 1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置(交换行和列)。
     */
    @Test
    public void practice1113(){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < a.length; i++){
            int b[] = a[i];
            for(int j = 0; j < b.length; j++ ){
                String s = "";
                System.out.print(a[j][i] + "    ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        practice113();
    }
}
