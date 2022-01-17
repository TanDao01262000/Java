package com.company.LeetCode.DecodeWays;

import java.util.HashMap;
import java.util.Map;

//A message containing letters from A-Z can be encoded into numbers using the following mapping:
//
//       'A' -> "1"
//        'B' -> "2"
//        ...
//        'Z' -> "26"
//        To decode an encoded message, all the digits must be grouped then mapped back into letters
//        using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
//
//        "AAJF" with the grouping (1 1 10 6)
//        "KJF" with the grouping (11 10 6)
//        Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
//
//        Given a string s containing only digits, return the number of ways to decode it.
//
//        The test cases are generated so that the answer fits in a 32-bit integer.
public class DecodeWays {

    public int numDecodings(String s) {
        Integer[] dp = new Integer[s.length() + 1];
        int ans = helper(s, 0, dp);
        return ans;
    }

    public int helper(String s, int idx, Integer[] dp) {
        if (idx >= s.length()) {
            return 1;
        }

        if (dp[idx] != null) return dp[idx];

        char ch = s.charAt(idx);
        if (ch == '0') return 0;

        int count = 0;
        count += helper(s, idx + 1, dp);

        if (idx + 1 < s.length()) {
            char ch2 = s.charAt(idx + 1);
            int num = (ch - '0') * 10 + (ch2 - '0');
            if (num <= 26) {
                count += helper(s, idx + 2, dp);
            }
        }
        return dp[idx] = count;
    }


    public static void main(String[] args) {
        Map<String, Integer> codeMap = new HashMap<>();
        System.out.println(Integer.parseInt("z"));
    }
}
