package weekly.evaluation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int length = scores.length;
        for (int i = 0; i < length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                list.add(scores[j][i]);
            }
            int nowScore = scores[i][i];
            int frequency = Collections.frequency(list, nowScore);
            if ((Collections.max(list) == nowScore || Collections.min(list) == nowScore) && frequency < 2)
                list.remove(list.indexOf(nowScore));
            double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
            if (average >= 90) answer += "A";
            else if (average >= 80) answer += "B";
            else if (average >= 70) answer += "C";
            else if (average >= 50) answer += "D";
            else answer += "F";
        }
        return answer;
    }
}