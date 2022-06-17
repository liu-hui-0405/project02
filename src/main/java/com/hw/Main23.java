package com.hw;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName: Main23
 * @Description: 删除字符串中出现次数最少的字符
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (Integer v : map.values()) {
            min = Math.min(min, v);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (map.get(c) != min) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
