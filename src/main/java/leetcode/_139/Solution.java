package leetcode._139;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];

        int maxWordLen = 0;
        int minWordLen = Integer.MAX_VALUE;
        for (String str : wordDict) {
            maxWordLen = Math.max(maxWordLen, str.length());
            minWordLen = Math.min(minWordLen, str.length());
        }

        for (int i = 0; i <= s.length(); ++i) {
            if (wordDict.contains(s.substring(0, i))) {
                dp[i] = true;
            }
            for (int j = i - 1; j >= 0; --j) {

                if (i - j > maxWordLen) {
                    break;
                } else if (i - j < minWordLen) {
                    continue;
                }

                String sub = s.substring(j, i);
                if (dp[j] == true && wordDict.contains(sub)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
