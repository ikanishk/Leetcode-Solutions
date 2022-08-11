/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//The approach is to keep running the traversal until the current root.val is p<root.val<q.
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val<root.val&& q.val<root.val){
        return lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val>root.val && q.val>root.val){
        return lowestCommonAncestor(root.right,p,q);
        }
        else{
        return root;
        }
    }
}