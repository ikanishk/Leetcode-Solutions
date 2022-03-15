class Solution {
    class Node{
        char c;
        int index;
        Node(char c,int i){
            this.c=c;
            this.index=i;
        }
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Node> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(new Node(c,i));
            }
            else if(c==')'){
                if(!stack.isEmpty() && stack.peek().c=='(')
                    stack.pop();
                else{
                    stack.push(new Node(c,i));
                }
            }
        }
        
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if ( !stack.isEmpty()  && s.charAt(i)==stack.peek().c && i==stack.peek().index){
                stack.pop();
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.reverse().toString();
        
    }
}