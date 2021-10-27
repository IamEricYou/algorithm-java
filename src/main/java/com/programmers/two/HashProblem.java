package com.programmers.two;

import java.util.*;

public class HashProblem {

    public static String unableCompleteRacing(String[] participant, String[] completion) {
        ArrayList<String> participantList = new ArrayList<String>( Arrays.asList(participant) );
        ArrayList<String> completionList = new ArrayList<String>( Arrays.asList(completion) );

        Collections.sort(participantList);
        Collections.sort(completionList);
        for (int i = 0, completionListSize=completionList.size(); i < completionListSize; i++) {
            if (!participantList.get(i).equals(completionList.get(i))) {
                return participantList.get(i);
            }
        }
        return participantList.get(participantList.size()-1);
    }

    public static String unableCompleteRacingSolveByHash(String[] participant, String[] completion) {
        Map<String, Integer> haspMap = new HashMap<>();
        for (String p : participant) {
            haspMap.put(p, haspMap.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            haspMap.put(c, haspMap.get(c) - 1);
        }

        for (String eachKey : haspMap.keySet()) {
            if (haspMap.get(eachKey) == 1) {
                return eachKey;
            }
        }
        return "";
    }

    public static boolean phoneBookList(String[] phoneBook) {

        ArrayList<String> phoneBookList = new ArrayList<>(Arrays.asList(phoneBook));
        phoneBookList.sort(Comparator.comparingInt(String::length));

        for (int i = 0, phoneBookListSize = phoneBookList.size(); i < phoneBookListSize; i++) {
            for (int j = i+1; j < phoneBookListSize; j++) {
                if (phoneBookList.get(j).startsWith(phoneBookList.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    // https://leetcode.com/problems/roman-to-integer/
    public static int romanToInt(String s) {
        Map<String, Integer> romanSymbolMap = new HashMap<>();
        int answer = 0;
        romanSymbolMap.put("I", 1);
        romanSymbolMap.put("V", 5);
        romanSymbolMap.put("X", 10);
        romanSymbolMap.put("L", 50);
        romanSymbolMap.put("C", 100);
        romanSymbolMap.put("D", 500);
        romanSymbolMap.put("M", 1000);

        for (int i = 0, sLength = s.length(); i < sLength; i++) {
            int firstNum = romanSymbolMap.get(String.valueOf(s.charAt(i)));
            if (i+1 == sLength) {
                answer += firstNum;
                break;
            }
            int nextNum = romanSymbolMap.get(String.valueOf(s.charAt(i+1)));
            if (firstNum >= nextNum) {
                answer += firstNum;
            } else {
                answer -= firstNum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("hash main");
    }
}
