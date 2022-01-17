package com.company.LeetCode.SearchInRotatedSortedArray;

public class Solution {
    public static int solution(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            // divide the arr to 2 halves
            int middle = left + (right - left) / 2;

            if (target <= arr[right] && arr[middle] > arr[right]) {
                left = middle + 1;

            } else if (target > arr[right] && arr[middle] <= arr[right]) {
                right = middle - 1;
            } else {

                if (arr[middle] == target) {
                    return middle;
                } else if (arr[middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution(nums, 6));
    }
}
