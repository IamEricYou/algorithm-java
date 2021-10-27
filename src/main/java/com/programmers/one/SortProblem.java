package com.programmers.one;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortProblem {
    public static int[] kNumber(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int[] eachCommand : commands) {
            int firstMove = eachCommand[0];
            int secondMove = eachCommand[1];
            int targetNumber = eachCommand[2] - 1;

            int[] newArrayCopy = Arrays.copyOfRange(array, firstMove - 1, secondMove);
            Arrays.sort(newArrayCopy);
            answer.add(newArrayCopy[targetNumber]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String biggestNumber(int[] numbers) {
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<String> stringComparingList = new ArrayList<String>();
        for (int num : numbers) {
            stringList.add(Integer.toString(num));
            stringComparingList.add(Integer.toString(num).repeat(3));
        }
        stringComparingList.sort(Comparator.naturalOrder());
        Collections.reverse(stringComparingList);
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
        return "";
    }

    public static String biggestNumberNewVersion(int[] numbers) {
        List<String> stringList = Arrays.stream(numbers).mapToObj(i -> String.valueOf(i)).collect(Collectors.toList());
        Collections.sort(stringList, (string1, string2) -> (string2 + string1).compareTo(string1 + string2));
        return !(stringList.get(0).equals("0")) ? stringList.stream().collect(Collectors.joining()) : "0";
    }

    public static int hIndex(int[] citations) {
        ArrayList<Integer> citationList = new ArrayList<Integer>(Arrays.stream(citations).boxed().collect(Collectors.toList()));
        Collections.sort(citationList);
        for (int i = 0, citationListSize = citationList.size(); i < citationListSize; i++) {
            if (citationList.get(i) >= citationListSize - i) {
                return citationListSize - i;
            }
        }
        return 0;
    }

    public static String sortStringBySize(String T) {
        return T.codePoints().mapToObj(c -> (char)c)
                .sorted(Comparator.reverseOrder()).map(Object::toString).collect(Collectors.joining());
    }



    public static void main(String[] args) {
        int[] kNumber = kNumber(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        String result = biggestNumberNewVersion(new int[]{3, 30, 34, 5, 9});
        int hIndex = hIndex(new int[]{3, 0, 6, 1, 5});
        String sortStringBySize = sortStringBySize("MMMLS");
        System.out.println("sortStringBySize = " + sortStringBySize);
    }
}

