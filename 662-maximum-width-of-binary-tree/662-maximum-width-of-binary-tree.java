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
    public class Pair{
        TreeNode node;
        int idx;
        
        Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        
        int max=Integer.MIN_VALUE;
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(root,0));
        
        while(q.size()>0){
            int lm=q.peek().idx;
            int rm=q.peek().idx;
            int size=q.size();
            while(size-->0){
                Pair rp=q.remove();
                rm=rp.idx;
                
                if(rp.node.left!=null)
                    q.add(new Pair(rp.node.left,rp.idx*2+1));
                if(rp.node.right!=null)
                    q.add(new Pair(rp.node.right,rp.idx*2+2));
                
                max=Math.max(max,rm-lm+1);
            }
        }
        
        return max;
    }
}