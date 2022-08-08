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

    public int diameterOfBinaryTree(TreeNode root) {
        int[]dia=new int[1];
        dfs(root,dia);
        return dia[0];
    }
    
    public int dfs(TreeNode node, int[] dia){
        if(node ==null) return 0;
        int lh=dfs(node.left,dia);
        int rh=dfs(node.right,dia);
        
        if((lh+rh)>dia[0]){
            dia[0]=lh+rh;
            // return dia[0];
        }
        
        return 1+Math.max(lh,rh);
    }
}


//     public int diameterOfBinaryTree(TreeNode root) {
//         int[] diameter = new int[1];
//         height(root, diameter);
//         return diameter[0];        
//     }

//     private int height(TreeNode node, int[] diameter) {
//         if (node == null) {
//             return 0;
//         }
//         int lh = height(node.left, diameter);
//         int rh = height(node.right, diameter);
//         diameter[0] = Math.max(diameter[0], lh + rh);
//         return 1 + Math.max(lh, rh);
//     }



