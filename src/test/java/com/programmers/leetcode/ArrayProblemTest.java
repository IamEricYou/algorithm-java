package com.programmers.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.programmers.leetcode.ArrayProblem.*;

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

    @Test
    void maxProfitTest3() {
        int[] num = {7, 4, 1, 2};
        int result = maxProfit(num);
        Assertions.assertEquals(1, result);
    }

    @Test
    void maxProfitTest4() {
        int[] num = {2, 4, 1};
        int result = maxProfit(num);
        Assertions.assertEquals(2, result);
    }

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    @DisplayName("배열 two sum Test")
    void twoSumTest(int[] numbers, int target, int[] expected) {
        Assertions.assertArrayEquals(expected, twoSum(numbers, target));
    }

    static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }
}