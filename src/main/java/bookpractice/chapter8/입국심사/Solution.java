package bookpractice.chapter8.입국심사;

public class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long left = 1;
        long right = getMaxTime(times) * (long) n;

        while (left <= right) {
            long mid = (left + right) / 2;
            long processed = 0;

            for (int time : times) {
                processed += mid / time;
            }

            if (processed >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private long getMaxTime(int[] times) {
        long maxTime = 0;
        for (int time : times) {
            maxTime = Math.max(maxTime, time);
        }
        return maxTime;
    }
}