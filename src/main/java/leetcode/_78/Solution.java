package leetcode._78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> answer = new ArrayList();
    int length;
    int position;

    public List<List<Integer>> subsets(int[] nums) {
        length = nums.length;
        for (position = 0; position < length + 1; ++position) {
            backtrack(0, new ArrayList<>(), nums);
        }
        return answer;
    }

    public void backtrack(int first, ArrayList<Integer> integers, int[] nums) {
        if (integers.size() == position) {
            answer.add(new ArrayList(integers));
            return;
        }
        for (int i = first; i < length; ++i) {
            integers.add(nums[i]);
            backtrack(i + 1, integers, nums);
            integers.remove(integers.size() - 1);
        }
    }
}
