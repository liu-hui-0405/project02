package com.leetcode.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Test01
 * @Description: 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

 * @Author: LH
 * @CreateDate: 2021/9/16
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2021/9/16
 * @UpdateRemark: UpdateRemark
 */
public class Test01 {

    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        int[] result = twoSum2(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     * 方法一 暴力枚举
     * 复杂度分析
     * 时间复杂度：O(N^2)，其中 NN 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     * 空间复杂度：O(1)。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 方法二：哈希表
     * 复杂度分析
     * 时间复杂度：O(N)，其中 NN 是数组中的元素数量。对于每一个元素 x，我们可以 O(1)O(1) 地寻找 target - x。
     * 空间复杂度：O(N)，其中 NN 是数组中的元素数量。主要为哈希表的开销。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}


