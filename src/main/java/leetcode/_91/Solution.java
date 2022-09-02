package leetcode._91;

public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; ++i) {
            for (int j = i - 1; j >= 0 && j > i - 3; --j) {
                String sub = s.substring(j, i);
                if (sub.charAt(0) == '0') {
                    continue;
                }
                int number = Integer.parseInt(sub);

                if (number > 0 && number <= 26) {
                    dp[i] += dp[j];
                }
            }
        }
        return dp[n];
    }
}
