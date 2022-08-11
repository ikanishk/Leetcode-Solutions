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
    List<Integer> lst = new ArrayList<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int l = 0;
        int r = lst.size() - 1;
        
        while(l<r){
            int sum = lst.get(l) + lst.get(r);
            if(sum == k){
                return true;
            }else if(sum < k){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
    
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        lst.add(root.val);
        inorder(root.right);
    }
}