package leetcode._47;

import java.util.*;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> allNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!allNums.containsKey(nums[i]))
                allNums.put(nums[i], 0);
            allNums.put(nums[i], allNums.get(nums[i]) + 1);
        }
        List<List<Integer>> answer = new ArrayList<>();
        backtracking(new LinkedList<>(), nums.length, answer, allNums);
        return answer;
    }

    public void backtracking(LinkedList<Integer> cur, int target, List<List<Integer>> answer, Map<Integer, Integer> allNums) {
        if (target == 0) {
            answer.add(new ArrayList<>(cur));
            return;
        }

        for (Integer key : allNums.keySet()) {
            if (allNums.get(key) == 0) continue;

            allNums.put(key, allNums.get(key) - 1);
            cur.addLast(key);
            backtracking(cur, target - 1, answer, allNums);
            cur.removeLast();
            allNums.put(key, allNums.get(key) + 1);
        }
    }
}
