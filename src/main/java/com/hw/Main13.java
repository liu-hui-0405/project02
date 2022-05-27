package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main12
 * @Description: 句子逆序
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(s[i] + " ");
            } else {
                System.out.print(s[i]);
            }
        }
    }
}
