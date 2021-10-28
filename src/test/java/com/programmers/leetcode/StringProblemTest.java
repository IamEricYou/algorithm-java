package com.programmers.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.programmers.leetcode.StringProblem.isPrefixString;
import static com.programmers.leetcode.StringProblem.lengthOfLastWord;
import static org.junit.jupiter.api.Assertions.*;

class StringProblemTest {

    @ParameterizedTest
    @MethodSource("testStringStream1")
    @DisplayName("스트링길이테스트")
    void searchInsertTest(String targetString, int expected) {
        Assertions.assertEquals(expected, lengthOfLastWord(targetString));
    }

    static Stream<Arguments> testStringStream1() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testStringStream2")
    @DisplayName("스트링테스트 - contains")
    void isPrefixStringTest(String targetString, String[] stringList, boolean expected) {
        Assertions.assertEquals(expected, isPrefixString(targetString, stringList));
    }

    static Stream<Arguments> testStringStream2() {
        return Stream.of(
                Arguments.of("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}, false),
                Arguments.of("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}, true),
                Arguments.of("ccccccccc", new String[]{"c", "cc"}, false),
                Arguments.of("applebananacookie", new String[]{"banana", "apple", "cookie"}, false),
                Arguments.of("aaa", new String[]{"aa", "aaa", "fjaklfj"}, false)
        );
    }
}