package leetcode._673;

import java.util.Arrays;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 0;
        int[] cut = new int[n];
        Arrays.fill(cut, 1);
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && 1 + dp[j] > dp[i]) {
                    dp[i] = 1 + dp[j];
                    cut[i] = cut[j];
                } else if (nums[i] > nums[j] && 1 + dp[j] == dp[i])
                    cut[i] += cut[j];
            }
            max = Math.max(max, dp[i]);
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max)
                cnt += cut[i];
        }
        return cnt;
    }
}
