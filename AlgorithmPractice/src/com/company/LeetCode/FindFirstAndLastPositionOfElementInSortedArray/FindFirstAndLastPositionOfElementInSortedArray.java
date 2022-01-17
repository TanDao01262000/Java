package com.company.LeetCode.FindFirstAndLastPositionOfElementInSortedArray;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//        If target is not found in the array, return [-1, -1].
//
//        You must write an algorithm with O(log n) runtime complexity.
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    // Apply binary search to find the most left element
    public int findLeftElement(int[] arr,  int data){
        int res = -1;

        int left = 0;
        int right = arr.length - 1 ;

        while (left <= right){
            int middle = left + (right - left)/ 2;

            if (arr[middle] == data){
                right  = middle -1;
                res = middle;
            }
            else if (arr[middle] > data){
                right  = middle -1;
            }else{
                left = middle +1;
            }


        }
        return res;

    }
    // Apply binary search to find the rightmost element
    public int findRightElement(int[] arr,  int data){
        int res = -1;

        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int middle = left + (right - left) / 2;


            if (arr[middle] == data){
                left  = middle +1;
                res = middle;
            }
            else if (arr[middle] < data){
                left  = middle +1;
            }else{
                right = middle -1;
            }
        }
        return res;

    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];

        res[0] = findLeftElement(nums, target);
        res[1] = findRightElement(nums, target);
        return res;
    }
    public void main(String[] args){
        int[] nums = {1, 2, 2, 2, 3, 4 , 5, 5, 8};
        System.out.println(searchRange(nums, 2));
    }

}


