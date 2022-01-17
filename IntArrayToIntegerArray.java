package com;

import java.util.Arrays;

public class IntArrayToIntegerArray {
    int[] arr = {1,2,3,4,5,6,7};

    // convert int[] to Integer[] of 0th and (n-2)th array
    Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

}
