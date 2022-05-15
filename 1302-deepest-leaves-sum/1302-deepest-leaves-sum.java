/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class SumResult {
        int maxHeight;
        int maxSum;
        SumResult() {
            this.maxHeight = Integer.MIN_VALUE;
            this.maxSum = 0;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        SumResult res = new SumResult();
        inorder(root, 0, res);
        return res.maxSum;
    }
    void inorder(TreeNode root, int height, SumResult res) {
        if (root == null)
            return;
        inorder(root.left, height + 1, res);
        if (root.left == null && root.right == null) {
            if (res.maxHeight < height) {
                res.maxHeight = height;
                res.maxSum = root.val;
            }
            else if (res.maxHeight == height)
                res.maxSum += root.val;
        }
        inorder(root.right, height + 1, res);
    }
}