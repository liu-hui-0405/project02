package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main15
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1) {
                n++;
            }
            num = num >> 1;
        }
        System.out.println(n);
    }
}
