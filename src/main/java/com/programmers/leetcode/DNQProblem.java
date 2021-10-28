package com.programmers.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DNQProblem {

    public static List<Integer> divideArrayHalf(List<Integer> arr, int target) {
        if (arr.size() == 1) {
            return arr;
        }

        List<Integer> left = arr.subList(0, arr.size() / 2);
        List<Integer> right = arr.subList(arr.size() / 2, arr.size());
        return left.get(left.size() - 1) > target ? divideArrayHalf(left, target) : divideArrayHalf(right, target);
    }

    // https://leetcode.com/problems/search-insert-position/
    public static int searchInsert(int[] nums, int target) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (numsList.contains(target)) return numsList.indexOf(target);
        int targetValue = divideArrayHalf(numsList, target).get(0);
        return targetValue > target ? numsList.indexOf(targetValue) : numsList.indexOf(targetValue) + 1;
    }

}
