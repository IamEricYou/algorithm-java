package com.programmers.leetcode;

import java.util.Arrays;
import java.util.List;

public class StringProblem {

    public static int lengthOfLastWord(String s) {
        List<String> stringList = Arrays.asList(s.strip().split(" "));
        return stringList.get(stringList.size() - 1).length();
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder compareString = new StringBuilder();
        for (String word : words) {
            compareString.append(word);
            if (compareString.toString().equals(s)) {
                return true;
            }

            if (s.contains(compareString)) {
                continue;
            }
            return false;
        }
        return false;
    }
}
