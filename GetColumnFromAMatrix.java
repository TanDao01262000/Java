package com;

import java.util.Arrays;

public class GetColumnFromAMatrix {
    int[][] matrix = {{1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}};

    int numOfCol = 1;  // column that we want to get
    Integer[] arr = Arrays.stream(matrix).map(x -> x[numOfCol]).toArray(Integer[]::new);
}
