package leetcode._90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> answer = new ArrayList();
    int length;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        length = nums.length;
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums);

        return answer;
    }

    public void backtrack(int first, ArrayList<Integer> integers, int[] nums) {
        for (int i = first; i < length; ++i) {
            if (i > first && nums[i - 1] == nums[i]) {
                continue;
            }
            integers.add(nums[i]);
            backtrack(i + 1, integers, nums);
            integers.remove(integers.size() - 1);
        }
        answer.add(new ArrayList(integers));
    }
}
