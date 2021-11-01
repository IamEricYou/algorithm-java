package com.programmers.leetcode;

import java.util.*;

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

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> comparingHashMap = new HashMap<>();
        for (int i = 0, size = s.length(); i < size; i++) {
            if (comparingHashMap.get(s.charAt(i)) != null) {
                if (!(comparingHashMap.get(s.charAt(i)) == t.charAt(i))) {
                    return false;
                }
            } else {
                comparingHashMap.put(s.charAt(i), t.charAt(i));
            }
        }

        Set<Object> uniqueValuesSet = new HashSet<>(comparingHashMap.values());
        return comparingHashMap.size() == uniqueValuesSet.size();
    }
}
