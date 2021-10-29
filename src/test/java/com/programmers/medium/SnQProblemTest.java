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
        int[] r = new int[]{1, 3, 2};

        Assertions.assertArrayEquals(r, developNewFeature(p, s));
    }
}