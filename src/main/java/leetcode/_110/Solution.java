package leetcode._110;

public class Solution {
    boolean balance;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return balance;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1) {
            balance = false;
        }

        return Math.max(left, right) + 1;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
