package leetcode._823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = 1_000_000_007;
        int length = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[length];
        Arrays.fill(dp, 1);

        Map<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < length; ++i) {
            hashMap.put(arr[i], i);
        }

        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];
                    if (hashMap.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[hashMap.get(right)]) % mod;
                    }
                }
            }
        }

        long ans = 0;
        for (long x : dp) {
            ans += x;
        }
        return (int) (ans % mod);
    }
}
