package com.company.LeetCode.JumpGame;

// The goal is the last index,  Walking backward at each index and check whether it can reach to the goal or not.

public class JumpGame {
    public static void main(String[] args) {
        int[] test1 = {2, 3, 1, 1, 4};
        int[] test2 = {3, 2, 1, 0, 4};
        int[] test3 = {3, 2, 1, 1, 0};
        int[] test4 = {3, 0};
        int[] test5 = {2, 0, 0};
        int[] test6 = {0, 2, 3};
        System.out.println(canJump1(test1));
        System.out.println(canJump1(test2));
        System.out.println(canJump1(test3));
        System.out.println(canJump1(test4));
        System.out.println(canJump1(test5));
        System.out.println(canJump1(test6));


    }



    // greedy algorithm
    // Going backward from the end to pull up the position we need to reach
    public static boolean canJump1(int[] nums) {

        int goal = nums.length-1;
        boolean res = false;

        if (goal == 0) res = true;

        for ( int i =nums.length-2; i >=0; i--){
            if ( goal-i <= nums[i]){
                goal =  i;
                res = true;
            } else{
                res = false;
            }

        }
        return res;
    }

    // Dynamic program approach, restore the boolean value of
    private static boolean canJump2(int[] nums) {

    }

    private static boolean[] solver(boolean[] dp, int index){

    }



}
