package com.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Main34
 * @Description: 图片整理
 * @Author: LH
 * @CreateDate: 2022/5/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/30
 * @UpdateRemark: UpdateRemark
 */
public class Main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            for (char c : chars) {
                System.out.print(c);
            }
        }
    }
}
