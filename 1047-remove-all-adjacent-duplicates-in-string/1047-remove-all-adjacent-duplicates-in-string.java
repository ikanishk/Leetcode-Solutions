class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
         StringBuilder string = new StringBuilder();
        while(!stack.isEmpty()){
            string.append(stack.pop());
        }
        return string.reverse().toString();
    }
}