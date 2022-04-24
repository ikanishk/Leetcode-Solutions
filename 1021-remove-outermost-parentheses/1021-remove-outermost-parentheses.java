class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i < s.length();i++) {
            char ch = s.charAt(i);
            
            //if we find '(' then just check if the stack is empty(which means the character is of the outermost bracket and we don't allow that in out answer.)
            if(ch == '(') {
                if(st.size() != 0) {
                    sb.append('(');
                }
                st.push(ch);
            }
            
            //if we find ')' we simply pop it and check if the stack is empty and then sppend it as an answer in the Stringlbuilder answer.
            else {
                st.pop();
                
                if(st.size() != 0) {
                    sb.append(')');
                }
            }
        }
        
        return sb.toString();
    }
}