package com.programmers.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
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

    // https://programmers.co.kr/learn/courses/30/lessons/42897

    public static int neighborHouse(int[] money) {
        int answer = 0;
        List<Integer> moneyList = Arrays.stream(money).boxed().collect(Collectors.toList());
        for (int i = 0, moneyListSize = moneyList.size(); i < moneyListSize; i++) {
            answer += Collections.max(moneyList);
            int index = moneyList.indexOf(Collections.max(moneyList));
            moneyList.set(index, 0);
            if (index == moneyListSize - 1) {
                moneyList.set(0, 0);
                moneyList.set(index - 1, 0);
            } else if (index == 0) {
                moneyList.set(index + 1, 0);
                moneyList.set(moneyListSize - 1, 0);
            } else {
                moneyList.set(index - 1, 0);
                moneyList.set(index + 1, 0);
            }
        }
        return answer;
    }
}
