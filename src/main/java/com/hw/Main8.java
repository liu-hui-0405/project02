package com.hw;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @ClassName: Main8
 * @Description: 合并表记录
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; ++i) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map.put(a, map.getOrDefault(a, 0) + b);
            }
            break;
        }
        for(Integer i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }
    }
}
