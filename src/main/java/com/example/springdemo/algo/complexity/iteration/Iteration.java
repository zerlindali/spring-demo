package com.example.springdemo.algo.complexity.iteration;

/**
 * 迭代
 */
public class Iteration {
    /**
     * for循环
     */
    static int forLoop(int n) {
        int res = 0;
        // 循环求和1,2..., (n-=2), (n-1)
        for (int i = 0; i < n; i++) {
            res ++;
        }
        return res;
    }

    /**
     * while循环
     */
    static int whileLoop(int n) {
        int res = 0;
        int i = 0;
        // 循环求和1,2,3...,(n-2),(n-1)
        while(i < n) {
            res += i;
            i ++;
        }
        return res;
    }

    /**
     * while循环（两次更新）
     */
    static int whileLoopII(int n) {
        int res = 0;
        int i = 1;
        // 循环求和 1, 4, 10
        while(i < n) {
            res += i;
            i ++;
            i *= 2;
        }
        return res;
    }

    /**
     * for循环（嵌套循环）
     */
    static String nestedForLoop(int n) {
        StringBuffer res = new StringBuffer();
        // 循环 0,1,2，... n-1
        for (int i = 0; i < n; i++) {
            // 循环 0,1,2，... n-1
            for (int j = 0; j < n; j++) {
                res.append("("+i+","+j+")");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        int res;

        res = forLoop(n);
        System.out.println("for循环求和结果 res = " + res);

        res = whileLoop(n);
        System.out.println("while循环求和结果 res = " + res);

        res = whileLoopII(n);
        System.out.println("while循环两次变更求和结果 res = " + res);

        String resStr = nestedForLoop(n);
        System.out.println("for嵌套循环结果 resStr = " + resStr);

    }

}
