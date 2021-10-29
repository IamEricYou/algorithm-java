package com.programmers.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.programmers.medium.DPProblem.intTriangle;
import static com.programmers.medium.DPProblem.neighborHouse;
import static org.junit.jupiter.api.Assertions.*;

class DPProblemTest {

    @ParameterizedTest
    @MethodSource("testStream")
    @DisplayName("DP 테스트-1")
    void solutionTest(int[][] testArr, int expected)  {
        Assertions.assertEquals(intTriangle(testArr), expected);
    }

    static Stream<Arguments> testStream() {
        return Stream.of(
                Arguments.of(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("neighborHouseTestCases")
    @DisplayName("DP 테스트-2")
    void neighborHouseTest(int[] money, int expected)  {
        Assertions.assertEquals(expected, neighborHouse(money));
    }

    static Stream<Arguments> neighborHouseTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{1, 5, 1, 5, 1}, 10),
                Arguments.of(new int[]{1000, 0, 0, 1000, 0, 0, 0, 1000, 0, 0, 1000}, 3000),
                Arguments.of(new int[]{1000, 1, 0, 1, 2, 1000, 0}, 2001),
                Arguments.of(new int[]{10, 2, 2, 100, 2}, 110)
        );
    }

}