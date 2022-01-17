package com.company.LeetCode.FindTheDuplicateNumber;

import java.util.HashSet;
import java.util.Set;


// n+1 size and numbers in range [1, n] -> there will be a duplicate based on the pigeonhole theory
public class FindTheDuplicateNumber {
    // time & space: O(n) implement of hashset
    public static int solution1(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int x : nums) {
            if (!(numsSet.contains(x))) {
                numsSet.add(x);
            } else {
                return x;
            }
        }
        return -1;
    }


    // Negative Marking time: O(n), space: O(1), but modify the list
    public static int solution2(int[] nums) {
        for (int x : nums) {
            if (nums[Math.abs(x)] > 0) {
                nums[Math.abs(x)] *= -1;
            } else {
                return Math.abs(x);
            }
        }
        return -1;
    }


    // Apply binary search  time: O(n * log n) since apply the count(), space: O(1)
     public static int solution3(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (count(nums, middle) > middle) {

                res = middle;
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }

        return res;
    }

    static int count(int[] nums, int target) {
        int count = 0;
        for (int x : nums) {
            if (x <= target) count++;
        }
        return count;
    }


    public static int solution4(int[] nums){


                // Find the intersection point of the two runners.
                int tortoise = nums[0];
                int hare = nums[0];

                do {
                    tortoise = nums[tortoise];
                    hare = nums[nums[hare]];
                } while (tortoise != hare);

                // Find the "entrance" to the cycle.
                tortoise = nums[0];

                while (tortoise != hare) {
                    tortoise = nums[tortoise];
                    hare = nums[hare];
                }

                return hare;
            }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8, 9, 7, 3, 6, 5};
        System.out.println(solution4(nums));
    }


}
