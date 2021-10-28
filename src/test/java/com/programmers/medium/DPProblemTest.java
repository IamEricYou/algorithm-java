package com.programmers.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.programmers.medium.DPProblem.intTriangle;
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
}