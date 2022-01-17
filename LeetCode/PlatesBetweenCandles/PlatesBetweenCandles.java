package com.company.LeetCode.PlatesBetweenCandles;

//There is a long table with a line of plates and candles arranged on top of it.
// You are given a 0-indexed string s consisting of characters '*' and '|' only,
// where a '*' represents a plate and a '|' represents a candle.
//
// You are also given a 0-indexed 2D integer array queries where
// queries[i] = [lefti, righti] denotes the substring s[lefti...righti] (inclusive).
// For each query, you need to find the number of plates between candles that are in the substring.
// A plate is considered between candles if there is at least one candle to its left and
// at least one candle to its right in the substring.
//
// For example, s = "||**||**|*", and a query [3, 8] denotes the substring "*||**|".
// The number of plates between candles in this substring is 2,
// as each of the two plates has at least one candle in the substring to its left and right.

//  Return an integer array answer where answer[i] is the answer to the ith query.
public class PlatesBetweenCandles {
    // O(N)
    public static void main(String[] args){
        String s ="*|****|**|****||";
        int[] query = {0, 11};
        System.out.println(platesCount(s,query));
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            res[i] = platesCount(s, queries[i]);
        }

        return res;
    }

    public static int platesCount(String s, int[] query) {

        String s1;
        // get substring
        s1 = s.substring(query[0], query[1]+1);


        int right = findRightmostCandle(s1);
        int left = findLeftmostCandle(s1);

        int total = right - left + 1;
        int countCandle = 0;

        for (int i =left; i <= right; i++) {
            if (s1.charAt(i) == '|') {
                countCandle++;
            }
        }

        return total - countCandle;

    }

    public static int findLeftmostCandle(String s1) {

        int count = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != '|'){
                count ++;
            }else{
                break;
            }
        }
        return count;
    }

    public static int findRightmostCandle(String s1) {
        int count = 0;
        for (int i = s1.length()-1; i >=0; i--) {
            if (s1.charAt(i) != '|') {
                count++;
            } else {
                break;
            }
        }
        return s1.length() - 1 - count;
    }
}
