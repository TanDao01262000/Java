package com.company.LeetCode.SearchA2DMatrix;

public class Solution {
    public static void main(String[] args){
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix1 = {{1,2}};
        System.out.println(search(matrix, 16));
    }

    // same logic but clever way and easier to do
    public static boolean search(int[][] matrix, int target) {
        int i=0;
        int j = matrix[0].length -1;


        while (i < matrix.length && target > matrix[i][j]  ){
            i++;
            System.out.println(i);
        }
        if (i > matrix.length) return false;
        if (matrix[i][j] == target){
            return true;
        }else{
            return binarySearch(matrix[i], target);
        }

    }

    public static boolean binarySearch(int[] arr, int target) {

        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            int M = L + (R - L) / 2;

            if (arr[M] == target) {
                return true;
            } else if (arr[M] > target) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        return false;
    }
}
