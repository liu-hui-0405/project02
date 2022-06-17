package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main53
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/5/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/30
 * @UpdateRemark: UpdateRemark
 */
public class Main53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 1 || n == 2) {
                System.out.println(-1);
            } else {
                if (n % 2 == 1) {
                    System.out.println(2);
                } else if (n % 4 == 0) {
                    System.out.println(3);
                } else {
                    System.out.println(4);
                }
            }
        }
    }
}
