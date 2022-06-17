package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main37
 * @Description: 统计每个月兔子的总数
 * @Author: LH
 * @CreateDate: 2022/5/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/30
 * @UpdateRemark: UpdateRemark
 */

public class Main37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(f(n));
        }
    }
    public static int f(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return  f(n-1)+f(n-2);
    }
}
