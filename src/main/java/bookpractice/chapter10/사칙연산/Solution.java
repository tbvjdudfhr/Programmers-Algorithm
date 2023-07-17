package bookpractice.chapter10.사칙연산;

import java.util.Arrays;

public class Solution {
    public int solution(String[] arr) {
        int n = (arr.length + 1) / 2;
        long[][] maxValues = new long[n][n];
        long[][] minValues = new long[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(maxValues[i], Long.MIN_VALUE);
            Arrays.fill(minValues[i], Long.MAX_VALUE);
            maxValues[i][i] = Long.parseLong(arr[i * 2]);
            minValues[i][i] = Long.parseLong(arr[i * 2]);
        }

        for (int d = 1; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                int j = i + d;
                for (int k = i; k < j; k++) {
                    if (arr[k * 2 + 1].equals("+")) {
                        maxValues[i][j] = Math.max(maxValues[i][j], maxValues[i][k] + maxValues[k + 1][j]);
                        minValues[i][j] = Math.min(minValues[i][j], minValues[i][k] + minValues[k + 1][j]);
                    } else {
                        maxValues[i][j] = Math.max(maxValues[i][j], maxValues[i][k] - minValues[k + 1][j]);
                        minValues[i][j] = Math.min(minValues[i][j], minValues[i][k] - maxValues[k + 1][j]);
                    }
                }
            }
        }

        return (int) maxValues[0][n - 1];
    }
}
