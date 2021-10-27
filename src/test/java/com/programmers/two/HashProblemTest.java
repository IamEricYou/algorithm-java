package com.programmers.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.programmers.two.HashProblem.phoneBookList;
import static com.programmers.two.HashProblem.romanToInt;
import static org.junit.jupiter.api.Assertions.*;

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
}