package com.InterpolationSort;

public class InterpolationSort {  // worst case O(n) for exponential array, best case for arithmetic sequence


    public static int interpolationSort(int[] arr, int data){
        int low = 0;
        int high = arr.length -1;

        while (data >= arr[low] && data <= arr[high] && low <= high){

            int probe = low + (high - low)*(data - arr[low])/(arr[high]-arr[low]);

            System.out.println("Probe: " + probe);
            if (data == arr[probe]){
                return probe;
            }else if (data < arr[probe]){
                high = probe -1;
            }else{
                low =  probe +1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] array1 = {1 ,3, 5,7 , 9};
        int[] array2 = {1, 2, 3, 8,  9, 19};

        int res = interpolationSort(array1, 7);
        System.out.println(res);
    }


}
