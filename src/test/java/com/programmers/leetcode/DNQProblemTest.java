package com.programmers.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static com.programmers.leetcode.DNQProblem.searchInsert;
import static org.junit.jupiter.api.Assertions.*;

class DNQProblemTest {

    @ParameterizedTest
    @MethodSource("testIntArray")
    @DisplayName("서치인서트 테스트")
    void searchInsertTest(int[] testArr, int target, int expected) {
        Assertions.assertEquals(expected, searchInsert(testArr, target));
    }

    static Stream<Arguments> testIntArray() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of((Object) new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of((Object) new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of((Object) new int[]{1}, 0, 0),
                Arguments.of((Object) new int[]{1, 3, 5, 6, 10}, 9, 4)
        );
    }

}