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
    public int pseudoPalindromicPaths (TreeNode root) {
    return pseudoPalindromicPaths(root, 0);
}
int pseudoPalindromicPaths (TreeNode root, int c) {
    if (root == null) return 0;
    c ^= 1 << root.val; // toggle bit for each number
    if (root.left == null && root.right == null) return (c&(c - 1)) > 0 ? 0 : 1; // return 1 when there's at most one bit set
    return pseudoPalindromicPaths(root.left, c) + pseudoPalindromicPaths(root.right, c);
}
}