package com.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Main14
 * @Description: 字符串排序
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        for (String s : arr){
            System.out.println(s);
        }
    }
}

