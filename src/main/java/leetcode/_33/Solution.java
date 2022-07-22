package leetcode._33;

import java.util.HashMap;

public class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        if (hashMap.containsKey(target)) {
            return hashMap.get(target);
        }

        return -1;
    }
}
