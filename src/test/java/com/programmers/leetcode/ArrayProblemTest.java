package com.programmers.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.programmers.leetcode.ArrayProblem.maxProfit;
import static com.programmers.leetcode.ArrayProblem.maxSubArray;
import static org.junit.jupiter.api.Assertions.*;

class ArrayProblemTest {

    @Test
    void maxSubArrayTest1() {
        int[] num = {1};
        int result = maxSubArray(num);
        Assertions.assertEquals(1, result);
    }

    @Test
    void maxSubArrayTest2() {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(num);
        Assertions.assertEquals(6, result);
    }

    @Test
    void maxSubArrayTest3() {
        int[] num = {5, 4, - 1, 7, 8};
        int result = maxSubArray(num);
        Assertions.assertEquals(23, result);
    }

    @Test
    void maxSubArrayTest4() {
        int[] num = {-2, -1};
        int result = maxSubArray(num);
        Assertions.assertEquals(-1, result);
    }
    //parameterized test

    @Test
    void maxProfitTest1() {
        int[] num = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(num);
        Assertions.assertEquals(5, result);
    }

    @Test
    void maxProfitTest2() {
        int[] num = {7, 6, 4, 3, 1};
        int result = maxProfit(num);
        Assertions.assertEquals(0, result);
    }
}