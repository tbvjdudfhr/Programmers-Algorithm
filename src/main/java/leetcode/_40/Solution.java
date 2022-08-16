package leetcode._40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> answer = new ArrayList<>();
        backtracking(0, target, candidates, new LinkedList<Integer>(), answer);
        return answer;
    }

    public void backtracking(int start, int target, int[] candidates, LinkedList<Integer> cur, List<List<Integer>> answer) {
        if (target == 0) {
            answer.add(new ArrayList<Integer>(cur));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                if (target - candidates[i] < 0) return;
                cur.addLast(candidates[i]);
                backtracking(i + 1, target - candidates[i], candidates, cur, answer);
                cur.removeLast();
            }
        }
    }
}
