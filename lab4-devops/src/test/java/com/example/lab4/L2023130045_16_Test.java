package com.example.lab4;

import org.junit.Test;
import static org.junit.Assert.*;

public class L2023130045_16_Test {

    // 示例 1：nums = [10,2] -> "210"
    @Test
    public void testCase1() {
        int[] nums = {10, 2};
        String got = Solution16.largestNumber(nums);
        assertEquals("201", got);
    }

    // 示例 2：nums = [3,30,34,5,9] -> "9534330"
    @Test
    public void testCase2() {
        int[] nums = {3, 30, 34, 5, 9};
        String got = Solution16.largestNumber(nums);
        assertEquals("9534330", got);
    }

    // 全零用例：nums = [0,0] -> "0"
    @Test
    public void testAllZero() {
        int[] nums = {0, 0};
        String got = Solution16.largestNumber(nums);
        assertEquals("0", got);
    }
}
