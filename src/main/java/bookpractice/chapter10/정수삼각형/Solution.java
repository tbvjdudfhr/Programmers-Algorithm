package bookpractice.chapter10.정수삼각형;

public class Solution {
    public int solution(int[][] triangle) {
        int height = triangle.length;

        int[][] dp = new int[height][height];

        for (int i = 0; i < height; i++) {
            dp[height - 1][i] = triangle[height - 1][i];
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) + triangle[i][j];
            }
        }

        return dp[0][0];
    }
}
