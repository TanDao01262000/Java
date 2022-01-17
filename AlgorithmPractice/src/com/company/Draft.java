package com.company;

public class Draft {

    public static void main(String[] args) {
        String s ="*|****|****|";
        System.out.println(findLeftmostCandle(s));
    }

    public static int findLeftmostCandle(String s1) {

        int left = 0;
        int right = s1.length() - 1;
        int res = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (s1.charAt(middle) == '|') {
                res = middle;
            }
            right = middle - 1;
        }
        return res;
    }
}
