package leetcode._213;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(robHelper(nums, 1, nums.length), robHelper(nums, 0, nums.length - 1));
    }

    public int robHelper(int[] nums, int si, int ei) {
        int prev = 0;
        int prev2 = 0;

        for (int i = si; i < ei; i++) {
            int noPick = prev;
            int pick = nums[i] + prev2;

            int curr = Math.max(pick, noPick);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}
