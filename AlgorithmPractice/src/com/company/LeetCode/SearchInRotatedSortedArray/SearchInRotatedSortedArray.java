package com.company.LeetCode.SearchInRotatedSortedArray;

//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
// or -1 if it is not in nums.
//
//        You must write an algorithm with O(log n) runtime complexity.

import java.util.Arrays;

public class SearchInRotatedSortedArray {

    // O(n) time
    public static int sort(int[] arr, int target){
        int i ;
        int res = -1;
        for ( i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                break;
            }
        }

        int[] nums1 = Arrays.copyOfRange(arr,0,i+1 );
        int[] nums2 = Arrays.copyOfRange(arr,i+1,arr.length );


        if ( binarySearch(nums2, target) != -1) {
            res = nums1.length + binarySearch(nums2, target);
        } else if ( binarySearch(nums1, target) != -1) {
            res = binarySearch(nums1, target);
        }

        return res;
    }

    public static int binarySearch(int[] arr, int target){

        int L =0;
        int R = arr.length -1;

        while (L <= R){
            int M = L + (R - L)/2;

            if (arr[M] == target){
                return M;
            }else if (arr[M] > target){
                R = M -1;
            }else{
                L =M +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(sort(nums, 1));
    }
}
//-----------------------------------------------------------------------------------------------------------------------------
//


