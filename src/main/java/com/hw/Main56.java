package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main56
 * @Description: 完全数计算
 * @Author: LH
 * @CreateDate: 2022/5/31
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/31
 * @UpdateRemark: UpdateRemark
 */
public class Main56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
