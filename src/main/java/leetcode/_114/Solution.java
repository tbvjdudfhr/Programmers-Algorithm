package leetcode._114;

public class Solution {

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            TreeNode leftRightMost = root.left;
            while (leftRightMost.right != null){
                leftRightMost = leftRightMost.right;
            }
            TreeNode rootRight = root.right;
            root.right = root.left;
            leftRightMost.right = rootRight;
            root.left = null;
        }
        flatten(root.right);
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
