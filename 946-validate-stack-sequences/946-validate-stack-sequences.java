class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int popCount=0;      
        for(int x: pushed){
            stack.push(x);
            while(!stack.isEmpty() && stack.peek() == popped[popCount]){
                stack.pop();
                popCount++;
            }
        }
    return popCount == N;
    }
}