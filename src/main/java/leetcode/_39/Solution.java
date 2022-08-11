package leetcode._39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0, len = candidates.length; i < len; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(candidates[i]);
            backtracking(candidates, i, 1, target - candidates[i], temp);
        }

        return result;
    }

    public void backtracking(int[] candidates, int index, int tempSize, int target, List<Integer> temp) {
        if (target == 0) {
            result.add(new ArrayList(temp));
            return;
        }

        for (int i = index, len = candidates.length; i < len; i++) {
            if (candidates[i] <= target) {
                temp.add(candidates[i]);
                backtracking(candidates, i, tempSize + 1, target - candidates[i], temp);
                temp.remove(tempSize);
            }
        }
    }
}
