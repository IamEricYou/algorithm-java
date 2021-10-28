package com.programmers.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.programmers.medium.ArrayMediumProblem.climbStarts;

class ArrayMediumProblemTest {

    @ParameterizedTest
    @MethodSource("minMovesTestStream")
    @DisplayName("숫자배열 테스트")
    void minMovesTest(int limit, int expected) {
        Assertions.assertEquals(expected, climbStarts(limit));
    }

    static Stream<Arguments> minMovesTestStream() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 5)
        );
    }
}