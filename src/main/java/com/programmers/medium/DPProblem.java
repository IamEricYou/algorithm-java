package com.programmers.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class DPProblem {

    // https://programmers.co.kr/learn/courses/30/lessons/43105
    public static int intTriangle(int[][] triangle) {
        for (int i = 1, triangleLength = triangle.length; i < triangleLength; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                } else if (j == i) {
                    triangle[i][j] += triangle[i - 1][i - 1];
                } else {
                    int num1 = triangle[i][j] + triangle[i - 1][j - 1];
                    int num2 = triangle[i][j] + triangle[i - 1][j];
                    triangle[i][j] = Math.max(num1, num2);
                }
            }
        }

        return Arrays.stream(triangle[triangle.length - 1]).max().getAsInt();
    }
}
