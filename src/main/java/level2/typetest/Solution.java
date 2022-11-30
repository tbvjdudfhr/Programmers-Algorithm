package level2.typetest;

import java.util.HashMap;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> point = new HashMap<>();

        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }


        for (int idx = 0; idx < choices.length; idx++) {
            if (choices[idx] > 4) {
                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
            } else {
                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
            }
        }

        for (char[] t : type) {
            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
        }

        return answer;
    }
}
