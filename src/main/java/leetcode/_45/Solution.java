package leetcode._45;

public class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int currMax = 0;
        int nextMax = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            nextMax = Math.max(nextMax, i + nums[i]);

            if (i == currMax) {
                count++;
                currMax = nextMax;
            }
        }

        return count;
    }
}
