package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main12
 * @Description: 字符串反转
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
