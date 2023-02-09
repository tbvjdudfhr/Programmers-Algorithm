package level2.인사고과;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] scores) {
        int answer = 0;
        int[] wonho = scores[0];

        Arrays.sort(scores, (x, y) -> {
            if (x[0] == y[0]) return Integer.compare(x[1], y[1]);
            else return Integer.compare(y[0], x[0]);
        });

        int tmpB = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {

            Boolean isDrop = false;

            if (tmpB < scores[i][1]) {
                tmpB = scores[i][1];
            } else if (tmpB > scores[i][1]) {
                isDrop = true;
            }

            if (isDrop) {
                if (scores[i][0] == wonho[0] && scores[i][1] == wonho[1]) {
                    return -1;
                }
                continue;
            }

            if (scores[i][0] + scores[i][1] > wonho[0] + wonho[1]) {
                answer++;
            }
        }

        return answer + 1;
    }
}