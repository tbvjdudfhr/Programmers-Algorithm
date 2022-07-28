package leetcode._209;

import java.util.Arrays;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (target > Arrays.stream(nums).sum()) {
            return 0;
        }

        int prod = 0;
        int left = 0;
        int len = nums.length;
        for (int right = 0; right < nums.length; right++) {
            prod += nums[right];
            while (prod >= target) {
                len = Math.min(len, right - left + 1);
                prod -= nums[left++];
            }
        }

        return len;
    }
}
