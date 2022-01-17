package com;

import java.util.Arrays;

public class ConcatenateTwoArrays {
    public static void main(String[] args){
        int[] test1 = {3, 2, 1, 0, 4};
        int[] test2 = {3, 2, 1, 1, 0};

        int[] concate = new int[test1.length + test2.length];
        System.arraycopy(test1, 0, concate, 0, test1.length);
        System.arraycopy(test2, 0, concate, test1.length, test2.length);
        System.out.println(Arrays.toString(concate));
    }

}
