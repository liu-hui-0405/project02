package com.hw;

import java.util.Scanner;

/**
 * @ClassName: Main60
 * @Description: 查找组成一个偶数最接近的两个素数
 * @Author: LH
 * @CreateDate: 2022/5/31
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/31
 * @UpdateRemark: UpdateRemark
 */
public class Main60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        for (int i = num / 2; i < num - 1; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num - i);
                System.out.println(i);
                return;
            }
        }
    }

    // 判断是否素数
    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
