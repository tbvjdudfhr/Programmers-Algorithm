package bookpractice.chapter8.징검다리;

import java.util.Arrays;

public class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);

        int answer = 0;
        int left = 1;
        int right = distance;

        while (left <= right) {
            int mid = (left + right) / 2;

            int removeCount = 0;
            int prevRock = 0;
            for (int i = 0; i < rocks.length; i++) {
                if (rocks[i] - prevRock < mid) {
                    removeCount++;
                } else {
                    prevRock = rocks[i];
                }
            }

            if (distance - prevRock < mid) {
                removeCount++;
            }

            if (removeCount <= n) {
                left = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}