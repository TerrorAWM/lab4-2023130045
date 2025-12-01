package com.example.lab4;

import java.util.*;

/**
 * @Description
 * 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）
 * 使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以返回字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 *
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 */
public class Solution16 {
    public static String largestNumber(int[] nums) {
        int n = nums.length;

        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }

        Arrays.sort(numsArr, (x, y) -> {
            String sx = String.valueOf(x);
            String sy = String.valueOf(y);
            return (sy + sx).compareTo(sx + sy);
        });

        if (numsArr[0] == 0) {
            return "0";
        }

        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }

        return ret.toString();
    }
}
