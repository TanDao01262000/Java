package com.company.LeetCode.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

// Approach1: Can complete with Brute Force: generate 2^2n strings and check the validation.
class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
//            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '0';
            generateAll(current, pos+1, result);
            current[pos] = '1';
            generateAll(current, pos+1, result);

        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }
}


public class GenerateParentheses {
    public static void main(String[] args){
        System.out.println(Solution.generateParenthesis(2));
    }

//    public static List<String> generateParenthesis(int n){
//        List<String> res = new ArrayList<>();
//        backtracking(res, new StringBuilder(), 0 ,  0, 2);
//        return res;
//    }
//    // Approach2: Backtracking NEED TO ADD A VALID CHECKING
//    public static void backtracking(List<String> res, StringBuilder cur, int openCount, int closeCount, int max){
//
//        // base case
//        if (cur.length() == max*2){
//            res.add(cur.toString());
//            return;
//        }
//
//        if (openCount < max){
//            cur.append('(');
//            backtracking(res, cur, openCount+1, closeCount, max);
//            cur.deleteCharAt(cur.length()-1);
//        }
//        if (closeCount < max){
//            cur.append(')');
//            backtracking(res, cur, openCount, closeCount+1, max);
//            cur.deleteCharAt(cur.length()-1);
//        }
//    }

    // Approach 3: Closure Number
//    public static List<String> solution(int n){
//
//    }
}
