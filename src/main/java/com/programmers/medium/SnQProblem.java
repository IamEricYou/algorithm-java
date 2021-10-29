package com.programmers.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class SnQProblem {

    // https://programmers.co.kr/learn/courses/30/lessons/42586?language=java
    public static int[] developNewFeature(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        int numberOfWork = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0, progressesLength = progresses.length; i < progressesLength; i++) {
            int currentWorkToBeCompleted = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) currentWorkToBeCompleted += 1;
            queue.add(currentWorkToBeCompleted);
        }

        int target = queue.poll();
        for (int q : queue) {
            if (target >= q) {
                numberOfWork += 1;
            } else {
                answerList.add(numberOfWork);
                numberOfWork = 1;
            }
        }
        answerList.add(numberOfWork);
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
