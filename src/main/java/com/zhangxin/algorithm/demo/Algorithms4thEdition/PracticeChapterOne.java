package com.zhangxin.algorithm.demo.Algorithms4thEdition;

import com.zhangxin.algorithm.demo.Algorithms4thEdition.Std.StdOut;
import org.junit.jupiter.api.Test;

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
    private void practice111() {
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
    private void practice112() {
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }

    /**
     * 1.1.4 下列语句各有什么问题(如果有的话)?
     * a. if (a > b) then c = 0;           Java无then关键字
     * b. if a > b { c = 0; }              a > b应该用()包起来
     * c. if (a > b) c = 0;                无问题
     * d. if (a > b) c = 0 else b = 0;     缺少分号和花括号
     */
    public void practice114() {
        int a = 0;
        int b = 1;
        int c;
        if (a > b) c = 0;
    }

    /**
     * 1.1.5 编写一段程序，如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true，否则打印 false。
     */
    @Test
    private void practice115() {
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
     * int f = 0;
     * int g = 1;
     * for (int i = 0; i <= 15; i++)
     * {
     *      StdOut.println(f);
     *      f = f + g;
     *      g = f - g;
     * }
     * 一个斐波那契数列
     */
    @Test
    private void practice116() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    /**
     * 1.1.7 分别给出以下代码段打印出的值:
     * a. double t = 9.0;
     * while (Math.abs(t - 9.0/t) > .001)
     * t = (9.0/t + t) / 2.0;
     * StdOut.printf("%.5f\n", t);
     *
     * b. int sum = 0;
     * for (int i = 1; i < 1000; i++)
     * for (int j = 0; j < i; j++)
     * sum++;
     * StdOut.println(sum);
     *
     * c. int sum = 0;
     * for (int i = 1; i < 1000; i *= 2)
     * for (int j = 0; j < 1000; j++)
     * sum++;
     * StdOut.println(sum);
     *
     * 3.00009
     * 499500
     * 10000
     */
    @Test
    private void practice117() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
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
    private void practice118() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    /**
     * 1.1.9 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
     */
    @Test
    private void practice119() {
        int N = 100;
        StringBuilder s = new StringBuilder();
        for (int n = N; n > 0; n /= 2)
            s.insert(0, (n % 2));
        System.out.println(s);
    }

    /**
     * 1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出行号和列号。
     */
    @Test
    private void practice1111() {
        boolean[][] a = {{true, false, true}, {false, true, false}, {true, true, true}};
        for (int i = 0; i < a.length; i++) {
            boolean[] b = a[i];
            for (int j = 0; j < b.length; j++) {
                String s = "";
                if (a[i][j]) {
                    s = "*";
                }
                System.out.println("第" + (int) (i + 1) + "行" + "第" + (int) (j + 1) + "列:" + s);
            }
        }
    }

    /**
     * 1.1.12 以下代码段会打印出什么结果?
     * 0 1 2 3 4 5 6 7 8 9
     */
    @Test
    private void practice1112() {
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
    private void practice1113() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            int[] b = a[i];
            for (int j = 0; j < b.length; j++) {
                System.out.print(a[j][i] + "    ");
            }
            System.out.println();
        }
    }

    /**
     * 1.1.14 编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log2N 的最大整数。不要使用 Math 库。
     */
    @Test
    private void practice1114() {
        int N = 10;
        int a = lg(N);
        System.out.println(a);
    }

    private static int lg(int n) {
        int a = 0;
        int i = 1;
        if (n < 0) {
            return -1;
        }

        while (i <= n) {
            i = 2 * i;
            a++;
        }

        return a - 1;
    }

    /**
     * 1.1.15
     * 编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小为 M 的数组，
     * 其中第 i 个元素的值为整数 i 在参数数组中出现的次数。如果 a[] 中的值均在 0 到 M-1之间，
     * 返回数组中所有元素之和应该和 a.length 相等。
     */
    @Test
    private void practice1115() {
        int[] a = {1, 2, 3, 2, 2, 3, 4, 1, 2, 0};
        int[] result = histogram(a, 5);
        for (int b : result)
            System.out.print(b + "  ");
    }

    private static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            int temp = 0;
            for (int value : a) {
                if (value == i) {
                    temp++;
                }
                result[i] = temp;
            }
        }
        return result;
    }

    /**
     * 1.1.16 给出 exR1(6) 的返回值:
     * public static String exR1(int n){
     *      if (n <= 0) return "";
     *      return exR1(n-3) + n + exR1(n-2) + n;
     * }
     *
     * 311361142246
     */
    @Test
    private void practice1116() {
        System.out.println(exR1(6));
    }

    private static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    /**
     * 1.1.18 请看以下递归函数:
     * public static int mystery(int a, int b){
     *      if (b == 0)     return 0;
     *      if (b % 2 == 0) return mystery(a+a, b/2);
     *      return mystery(a+a, b/2) + a;
     * }
     * mystery(2, 25) 和 mystery(3, 11) 的返回值是多少?给定正整数 a 和 b，mystery(a,b)
     * 计算的结果是什么?将代码中的 + 替换为 * 并将 return 0 改为 return 1，然后回答相同
     * 的问题。
     */
    @Test
    private void practice1118() {
        System.out.println(mystery1(2, 25));
        System.out.println(mystery1(3, 11));
        System.out.println(mystery2(2, 25));
        System.out.println(mystery2(3, 11));
    }

    private static int mystery1(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery1(a + a, b / 2);
        return mystery1(a + a, b / 2) + a;
    }

    private static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a + a, b / 2);
        return mystery2(a * a, b / 2) + a;
    }

    /**
     * 1.1.20 编写一个递归的静态方法计算 ln(N!) 的值。
     */
    @Test
    private void practice1120() {
        double result = lnNFactorial(10);
        System.out.println(result);
    }

    private static double lnNFactorial(int N) {
        int NFactorial = factorial(N);
        return Math.log(NFactorial) / Math.log(Math.E);
    }

    private static int factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be>=0");
        }
        if (x <= 1) {
            return 1;
        } else
            return x * factorial(x - 1);
    }

    /**
     * 1.1.22
     * 使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。
     * 每当该方法被调用时，打印出它的参数 lo 和 hi 并按照递归的深度缩进。
     * 提示:为递归方法添加一个参数 来保存递归的深度。
     */
    @Test
    private void practice1122() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        rank(1, a);
    }

    private static void rank(int key, int[] a) {
        rank(key, a, 0, a.length - 1, 1);
    }

    private static int rank(int key, int[] a, int lo, int hi, int deep) {
        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        for(int i = 0; i < deep; i++) {
            System.out.print(" ");
        }
        System.out.println("lo:" + lo + "" + "hi:" + hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, ++deep);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, ++deep);
        else return mid;
    }

    /**
     * 1.1.23
     * 为 BinarySearch 的测试用例添加一个参数:+ 打印出标准输入中不在白名单上的值;-，则打 印出标准输入中在白名单上的值。
     */

    /**
     * 1.1.25
     * 使用数学归纳法证明欧几里德算法能够计算任意一对非负整数 p 和 q 的最大公约数。
     */
    @Test
    public void practice1125() {
        if(gcd(1997, 615) == gcd(615, 152)) {
            System.out.println("欧几里德算法正确");
        }
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        System.out.println("a : " + a + "  b : " + b);
        return gcd(b, a%b);
    }

    /**
     * 1.1.26 将三个数字排序。假设 a、b、c 和 t 都是同一种原始数字类型的变量。证明以下代码能够将 a、 b、c 按照升序排列:
     * if (a > b) { t = a; a = b; b = t; } if (a > c) { t = a; a = c; c = t; } if (b > c) { t = b; b = c; c = t; }
     */
    @Test
    public void practice1126() {
        int a = 3;
        int b = 2;
        int c = 1;
        int t;
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }

        System.out.println(a + "," + b + "," + c);
    }

}

/**
 * 1.1.3 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。
 */
class Practice113 {
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

    public static void main(String[] args) {
        practice113();
    }
}

/**
 * 1.1.19 在计算机上运行以下程序:
 *
 * public class Fibonacci
 *         {
 *            public static long F(int N)
 *            {
 *               if (N == 0) return 0;
 *               if (N == 1) return 1;
 *               return F(N-1) + F(N-2);
 *            }
 *            public static void main(String[] args)
 *            {
 *               for (int N = 0; N < 100; N++)
 *                  StdOut.println(N + " " + F(N));
 *            }
 *         }
 * 计算机用这段程序在一个小时之内能够得到 F(N) 结果的最大 N 值是多少?开发 F(N) 的一
 * 个更好的实现，用数组保存已经计算过的值。
 *
 * 尾递归
 */
class Practice1119 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long Fib(int N) {
        long[] f = new long[N+1];
        return Fib(N, f);
    }

    public static long Fib(int N, long[] f) {
        if (f[N] == 0) {
            if (N == 1)
                f[N] = 1;
            else if (N > 1)
                f[N] = Fib(N-1, f) + Fib(N-2, f);
        }

        return f[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + Fib(N));
    }
}

/**
 * 1.1.21 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，精确到小数点后三位。
 * 可以用这种程序将棒球球手的击球命中率或者学生的考试分数 制成表格。
 */
class Practice1121 {

    public static void main(String[] args) {
        practice1121();
    }

    private static void practice1121() {
        System.out.println("请输入姓名和两个数字，用空格隔开：");
        Scanner sc = new Scanner(System.in);
        String[] a = new String[2];
        int index =0;
        while(index<a.length){
            a[index] = sc.nextLine();
            index++;
        }

        for(int i=0; i< a.length;i++){
            String s = a[i];
            String[] stringArr = s.split(" ");
            int num1 = Integer.parseInt(stringArr[1]);
            int num2 = Integer.parseInt(stringArr[2]);
            System.out.printf("%-5s%-5d%-5d%.3f\n",stringArr[0],num1,num2,((double)num1/num2));
        }
    }
}

/**
 * 1.1.24
 * 给出使用欧几里德算法计算 105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值。
 * 扩展该算法中的代码得到一个程序 Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
 * 使用你的程序计算 1 111 111 和 1 234 567 的最大公约数。
 *
 * 其计算原理依赖于下面的定理：
 * 定理：两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数。最大公约数（Greatest Common Divisor）缩写为GCD。
 * gcd(a,b) = gcd(b,a mod b) (不妨设a>b 且r=a mod b ,r不为0)
 */
class Euclid {
    public static void main(String[] args) {
        practice1124();
    }

    private static void practice1124() {
        System.out.println("请输入两个数字....");
        Scanner sc1 = new Scanner((System.in));
        String string1 = sc1.next();

        Scanner sc2 = new Scanner((System.in));
        String string2 = sc2.next();

        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);

        int a = gcd(number1, number2);
        System.out.println("最大公约数是：" + a);
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        System.out.println("a : " + a + "  b : " + b);
        return gcd(b, a%b);
    }
}