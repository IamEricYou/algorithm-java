package com.programmers.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
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
        }
        return largestSum;
    }

    public static int maxProfit(int[] prices) {
        int compareNum = prices[0];
        prices[0] = 0;
        boolean isEverPriceDown = false;
        for (int i = 1, priceLength = prices.length; i < priceLength; i++) {
            if ( prices[i] - compareNum >= 0) {
                prices[i] = prices[i] - compareNum;
                isEverPriceDown = true;
            } else {
                int swapVal = compareNum;
                compareNum = prices[i];
                prices[i] = prices[i] - swapVal;
            }
        }

        System.out.println("Arrays.toString(prices) = " + Arrays.toString(prices));
        return isEverPriceDown ? Arrays.stream(prices).max().getAsInt() : 0;
    }
}
