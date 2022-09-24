package leetcode._2131;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int mid = 0;
        int ans = 0;
        for (String str : words) {
            String rev = reverse(str);
            int val = map.getOrDefault(rev, 0);
            if (val >= 1) {
                if (str.charAt(0) == str.charAt(1))
                    mid--;
                ans += 4;
                map.put(rev, val - 1);
            } else {
                if (str.charAt(0) == str.charAt(1))
                    mid++;
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        if (mid > 0)
            ans += 2;

        return ans;
    }

    String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
