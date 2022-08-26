package leetcode._55;

public class Solution {
    public boolean canJump(int[] nums) {
        int nextMax = 0;
        for (int i = 0; i < nums.length; i++) {
            nextMax = Math.max(nextMax, i + nums[i]);

            if (nextMax >= nums.length - 1) {
                return true;
            }

            if (nextMax == i) {
                return false;
            }
        }
        return true;
    }
}
