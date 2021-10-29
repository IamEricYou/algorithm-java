package com.programmers.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.programmers.two.HashProblem.majorityElement;
import static com.programmers.two.HashProblem.romanToInt;

class HashProblemTest {

//    @Test
//    void phoneBookListTest1() {
//        boolean result1 = phoneBookList(new String[]{"119", "97674223", "1195524421"});
//        Assertions.assertEquals(result1, false);
//    }
//
//    @Test
//    void phoneBookListTest2() {
//        boolean result2 = phoneBookList(new String[]{"123", "456", "789"});
//        Assertions.assertEquals(result2, true);
//
//    }
//
//    @Test
//    void phoneBookListTest3() {
//        boolean result3 = phoneBookList(new String[]{"12", "123", "1235", "567", "88"});
//        Assertions.assertEquals(result3, false);
//    }

    @Test
    void romanToIntTest1() {
        int s = romanToInt("III");
        Assertions.assertEquals(s, 3);
    }

    @Test
    void romanToIntTest2() {
        int s = romanToInt("IV");
        Assertions.assertEquals(s, 4);
    }

    @Test
    void romanToIntTest3() {
        int s = romanToInt("IX");
        Assertions.assertEquals(s, 9);
    }

    @Test
    void romanToIntTest4() {
        int s = romanToInt("MCMXCIV");
        Assertions.assertEquals(s, 1994);
    }

    @ParameterizedTest
    @MethodSource("majorityElementTestCases")
    @DisplayName("majorityElementTest 테스트")
    void majorityElementTest(int[] numbers, int expected) {
        Assertions.assertEquals(expected, majorityElement(numbers));
    }

    static Stream<Arguments> majorityElementTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }
}