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
public class Solution {
    int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    
    // helper returns the max branch 
    // plus current node's value
    int helper(TreeNode root) {
        if (root == null) return 0;
        
    //We check that both the lef t and right subtree have a +ve value as adding a -ve will decrease sum.
    //If the sum of either left and right subtree is -ve, then it will make the value of that part as 0.
        int leftSum = Math.max(helper(root.left), 0);
        int rightSum = Math.max(helper(root.right), 0);
        
        //Check if adding the root.val in the maxsum will increase the maxsum.
        max = Math.max(max, root.val + leftSum + rightSum);
        
        return root.val + Math.max(leftSum, rightSum);
    }
}