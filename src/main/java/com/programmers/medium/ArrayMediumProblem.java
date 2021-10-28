package com.programmers.medium;

import java.util.HashMap;

public class ArrayMediumProblem {

    public static int calculateNumberOfStairsByFibonacci(HashMap<Integer, Integer> stairMap, int n) {
        stairMap.put(0, 0);
        stairMap.put(1, 1);
        for(int i = 2; i <= n; i++) {
            stairMap.put(i, stairMap.get(i - 1) + stairMap.get(i - 2));
        }
        return stairMap.get(n);
    }
//    https://leetcode.com/problems/climbing-stairs/
    public static int climbStarts(int limit) {
        HashMap<Integer, Integer> stairMap = new HashMap<Integer, Integer>();
        return calculateNumberOfStairsByFibonacci(stairMap, limit+1);
    }
}
