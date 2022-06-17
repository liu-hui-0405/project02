package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main61
 * @Description: 放苹果
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
 * 注意：如果有7个苹果和3个盘子，（5，1，1）和（1，5，1）被视为是同一种分法。
 * @Author: LH
 * @CreateDate: 2022/5/31
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/31
 * @UpdateRemark: UpdateRemark
 */
public class Main61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = count(sc.nextInt(), sc.nextInt());
        System.out.println(count);
    }

    public static int count(int m, int n) {
        if (m < 0 || n <= 0) {
            return 0;
        }
        if (m == 1 || n == 1 || m == 0) {
            return 1;
        }
        return count(m, n - 1) + count(m -n, n);
    }
}
