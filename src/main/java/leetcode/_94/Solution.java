package leetcode._94;

import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return null;
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
