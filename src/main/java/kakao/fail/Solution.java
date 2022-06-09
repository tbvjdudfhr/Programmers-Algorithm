package kakao.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Stage> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int fail = 0;
            int total = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    fail++;
                }
                if (stages[j] >= i + 1) {
                    total++;
                }
            }

            arr.add(new Stage(i + 1, fail == 0 ? 0.0 : (double) fail / total));
        }
        Collections.sort(arr);

        for (int i = 0; i < N; i++) {
            answer[i] = arr.get(i).n;
        }

        return answer;
    }

    class Stage implements Comparable<Stage> {
        int n;
        double rate;

        public Stage(int n, double rate) {
            this.n = n;
            this.rate = rate;
        }

        @Override
        public int compareTo(Stage other) {
            int compareValue = Double.compare(other.rate, this.rate);

            if (compareValue == 0) {
                return Integer.compare(this.n, other.n);
            }

            return compareValue;
        }
    }
}
