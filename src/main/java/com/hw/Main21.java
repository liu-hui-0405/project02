package com.hw;

import java.util.*;

/**
 * @ClassName: Main21
 * @Description: 简单密码
 * @Author: LH
 * @CreateDate: 2022/5/27
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/27
 * @UpdateRemark: UpdateRemark
 */
public class Main21 {
    private static Map<String, String> map = new HashMap<>();
    static{
        map.put("1","1");
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");
        map.put("0","0");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char c : chars) {
            if ('0' <= c && c <= '9') {
                sb.append(c);
            } else if ('A' <= c && c <= 'Y') {
                char newChar = (char) (c + 32 + 1);
                sb.append(newChar);
            } else if ('Z' == c) {
                sb.append('a');
            } else {
                Set<String> set = map.keySet();
                for (String s : set) {
                    if (s.contains(String.valueOf(c))) {
                        sb.append(map.get(s));
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
