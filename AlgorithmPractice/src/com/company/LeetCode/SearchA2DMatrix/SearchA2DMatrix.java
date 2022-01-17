package com.company.LeetCode.SearchA2DMatrix;

//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//        Integers in each row are sorted from left to right.
//        The first integer of each row is greater than the last integer of the previous row.

import java.util.Arrays;

public class SearchA2DMatrix {

    // O(n*log n)
    public static boolean search(int[][] matrix, int target) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int res = binarySearch(matrix[i], target);
            if (res != -1) {
                return true;
            }
        }

        return false;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    // O(log n)
    public static boolean search1(int[][] matrix, int target) {
        int res = -1;
        if (matrix[0].length == 1) {

            Integer[] arr = Arrays.stream(matrix).map(x -> x[0]).toArray(Integer[]::new);

            res = binarySearchWrapper(arr, target);

        } else if(matrix.length == 1){
            res = binarySearch(matrix[0],target);
        }
        else {


            // get a column from a matrix
            int numOfCol = matrix[0].length - 1;
            Integer[] arr = Arrays.stream(matrix).map(x -> x[numOfCol]).toArray(Integer[]::new);


            // check whether the target is in the first or last row
            if (target == arr[0]) {
                return true;
            } else if (target < arr[0]) {
                res = binarySearch(matrix[0], target);

            } else if (target == arr[arr.length - 2]) {
                return true;
            } else if (target > arr[arr.length - 2]) {
                res = binarySearch(matrix[arr.length - 1], target);

            } else {
                int middle = closetIndex(arr, target);
                System.out.println(middle);
                if (arr[middle] == target) {
                    return true;
                } else if (arr[middle] < target) {
                    res = binarySearch(matrix[middle + 1], target);

                } else {
                    res = binarySearch(matrix[middle], target);
                }
            }

        }

        if (res != -1) {
            return true;
        } else {
            return false;
        }
    }


    public static int closetIndex(Integer[] arr, int target) {

        int L = 0;
        int R = arr.length - 1;
        int M = -1;

        while (L <= R) {
            M = L + (R - L) / 2;

            if (arr[M] == target) {
                return M;
            } else if (arr[M] > target) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }

        return M;
    }
    public static int binarySearchWrapper(Integer[] arr, int target) {

        int L = 0;
        int R = arr.length - 1;


        while (L <= R) {
            int M = L + (R - L) / 2;

            if (arr[M] == target) {
                return M;
            } else if (arr[M] > target) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target) {

        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            int M = L + (R - L) / 2;

            if (arr[M] == target) {
                return M;
            } else if (arr[M] > target) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2}};
        int[][] matrix1 = {{1,1}};

        System.out.println(search1(matrix, 2));

    }

}