package level2.fruitvendor;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] filterScore = Arrays.stream(score)
                .filter(value -> value <= k)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(filterScore, Collections.reverseOrder());
        int count = filterScore.length / m;

        for (int i = 0; i < count; i++) {
            Integer[] integers = Arrays.copyOfRange(filterScore, i * m, i * m + m);
            Integer min = Arrays.stream(integers).min(Integer::compareTo).get();
            answer += min * m;
        }

        return answer;
    }
}
