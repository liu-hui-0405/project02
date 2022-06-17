package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main62
 * @Description: 查找输入整数二进制中1的个数
 * @Author: LH
 * @CreateDate: 2022/5/31
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/31
 * @UpdateRemark: UpdateRemark
 */
public class Main62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x <= 14; x++) {
            if ((100 - 7 * x) % 4 == 0) {
                int y = (100 - 7 * x) / 4;
                int z = 100 - x - y;
                System.out.println(x + " " + y + " " + z + " ");
            }
        }
    }
}
