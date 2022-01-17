package com.company.LeetCode.MaximumSubarray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] nums = {-9 ,5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        Integer[] dp  = new Integer[nums.length+1];
        System.out.println(dp[0]);
        return maxSumAtIndex(0, dp, nums);

    }

    public static int maxSumAtIndex(int n, Integer[] dp, int[] nums) {

        if (dp[n] != null) return dp[n];

        if (n == nums.length - 1) return nums[n];

        int res = 0;

        res = Math.max(nums[n], nums[n] + maxSumAtIndex(n + 1, dp, nums));
        dp[n] = res;
        return res;
    }
}

