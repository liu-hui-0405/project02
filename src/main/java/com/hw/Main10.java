package com.hw;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @ClassName: Main10
 * @Description: 字符个数统计
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        System.out.println(hs.size());
    }
}
