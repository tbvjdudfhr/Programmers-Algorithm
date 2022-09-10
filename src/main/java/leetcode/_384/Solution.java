package leetcode._384;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    Random rand;
    int len;
    int[] shuffled;
    int[] original;

    public Solution(int[] nums) {
        rand = new Random();
        len = nums.length;
        shuffled = new int[len];
        original = nums;
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        Arrays.fill(shuffled, Integer.MIN_VALUE);
        for (int i = 0; i < len; ) {
            int newPos = rand.nextInt(len);
            if (shuffled[newPos] == Integer.MIN_VALUE) {
                shuffled[newPos] = original[i++];
            }
        }
        return shuffled;
    }
}
