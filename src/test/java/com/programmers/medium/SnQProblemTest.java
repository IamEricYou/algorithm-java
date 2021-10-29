package com.programmers.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.programmers.medium.SnQProblem.developNewFeature;
import static org.junit.jupiter.api.Assertions.*;

class SnQProblemTest {

    @Test
    void solutionTest() {
        int[] p = new int[]{93, 30, 55};
        int[] s = new int[]{1, 30, 5};
        int[] r = new int[]{2, 1};

        Assertions.assertArrayEquals(r, developNewFeature(p, s));
    }

    @Test
    void solutionTest2() {
        int[] p2 = new int[]{99, 99, 99};
        int[] s2 = new int[]{1, 1, 1};
        int[] r2 = new int[]{3};

        Assertions.assertArrayEquals(r2, developNewFeature(p2, s2));
    }

    @Test
    void solutionTest3() {
        int[] p3 = new int[]{96, 99, 98, 97};
        int[] s3 = new int[]{1, 1, 1, 1};
        int[] r3 = new int[]{4};

        Assertions.assertArrayEquals(r3, developNewFeature(p3, s3));
    }
}