package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main35
 * @Description: 蛇形矩阵
 * 输入：
 * 4
 * 输出：
 * 1 3 6 10
 * 2 5 9
 * 4 8
 * 7
 * @Author: LH
 * @CreateDate: 2022/5/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/30
 * @UpdateRemark: UpdateRemark
 */
public class Main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] result = new int[n][];
        int t = 1;
        for (int i = 0; i < n; i++) {
            //数组第i行有n-i个元素
            result[i] = new int[n - i];
            //对第i个对角线赋值
            for (int j = 0; j <= i; j++) {
                result[i - j][j] = t;
                t++;
            }
        }
        //输出数组值
        for (int[] a : result) {
            for (int a1 : a) {
                System.out.print(a1 + " ");
            }
            System.out.println();
        }
    }
}
