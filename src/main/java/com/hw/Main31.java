package com.hw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: Main24
 * @Description: 单词倒排
 * @Author: LH
 * @CreateDate: 2022/5/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/30
 * @UpdateRemark: UpdateRemark
 */
public class Main31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                temp += c;
            } else {
                if (temp.length() > 0) {
                    result.add(temp);
                    temp = "";
                }
            }
        }
        if (temp.length() > 0) {
            result.add(temp);
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
