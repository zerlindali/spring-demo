package com.example.springdemo.algo.complexity.recursion;

/**
 * 递归
 */
public class Recursion {
    /**
     * 递归调用
     * @param n
     */
    static int recur(int n) {
        int res = 0;
        // 终止条件
        while (n > 0) {
            res += n;
            // 递: 递归调用
            recur(--n);
        }
        // 归：返回结果
        return res + n;
    }

    public static void main(String[] args) {
        int res;
        int n = 4;
        res = recur(n);
        System.out.println("调用递归求和结果 res = " + res);
    }
}
