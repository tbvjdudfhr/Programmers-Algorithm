package level2.우박수열정적분;

import java.util.ArrayList;

public class Solution {
    public double[] solution(int k, int[][] ranges) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(k);
        while (k != 1) {
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            list.add(k);
        }

        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = list.size() - 1 + ranges[i][1];

            if (start == end) {
                answer[i] = 0.0;
                continue;
            }
            if (start > end) {
                answer[i] = -1.0;
                continue;
            }

            double sum = list.get(start) + list.get(end);
            start++;
            while (start < end) {
                sum += (list.get(start) * 2);
                start += 1;
            }
            answer[i] = sum / 2;
        }

        return answer;
    }
}
