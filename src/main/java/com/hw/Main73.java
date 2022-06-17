package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main73
 * @Description: 计算日期到天数转换
 * @Author: LH
 * @CreateDate: 2022/6/1
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/6/1
 * @UpdateRemark: UpdateRemark
 */
public class Main73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int[] dayofmonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += dayofmonth[i];
        }
        sum += d;
        if (m > 2) {
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int y = sc.nextInt();
    //     int m = sc.nextInt();
    //     int d = sc.nextInt();
    //     Calendar cal = Calendar.getInstance();
    //     cal.set(y, m - 1, d);
    //     System.out.println(cal.get(Calendar.DAY_OF_YEAR));
    // }
}
