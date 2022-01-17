package com.company.LeetCode.ClimbingStairs;

//You are climbing a staircase. It takes n steps to reach the top.
//
//        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        Integer[] dp = new Integer[n + 1];
        int res = helper(n, dp);
        return res;

    }

    public static int helper(int n, Integer[] dp) {

        if (dp[n] != null) {
            return dp[n];
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n <= 0) {
            return 0;
        }


        int res = 0;
        res += helper(n - 1, dp) + helper(n - 2, dp);

        dp[n] = res;

        return res;

    }

}
