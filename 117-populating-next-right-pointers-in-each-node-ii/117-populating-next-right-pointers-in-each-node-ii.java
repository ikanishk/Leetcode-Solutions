/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        //bfs algorithm
        
        Queue<Node> queue = new LinkedList();
        if(root == null)
            return root;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size(); //help us know how many nodes are in the given level
            for(int i = 1; i<= size; i++){
                Node curr = queue.poll();
                if(i != size) //check if the node is not right most one in the level
                    curr.next=queue.peek();
                if(curr.left != null) //adding to the queue for next level
                    queue.add(curr.left);
                if(curr.right != null)  //adding to the queue for next level
                    queue.add(curr.right);
            }
        }
        return root;
    }
}