package com.programmers.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayProblem {
    public static int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1, numSize = nums.length; i < numSize; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            largestSum = Math.max(largestSum, nums[i]);
            System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        }
        return largestSum;
    }

    public static int maxProfit(int[] prices) {
        
        return 0;
    }

    public static void main(String[] args) {
    }
}
