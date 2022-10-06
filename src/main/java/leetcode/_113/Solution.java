package leetcode._113;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<>(), paths);

        return paths;

    }

    public void findPaths(TreeNode root, int sum, List<Integer> curr, List<List<Integer>> paths) {
        if (root == null)
            return;
        curr.add(root.val);
        if (root.val == sum && root.left == null && root.right == null) {
            paths.add(curr);
            return;
        }

        findPaths(root.left, sum - root.val, new ArrayList<>(curr), paths);
        findPaths(root.right, sum - root.val, new ArrayList<>(curr), paths);
    }

    public static class TreeNode {
        int val;
        Solution.TreeNode left;
        Solution.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Solution.TreeNode left, Solution.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
