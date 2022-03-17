class Solution {
    public int scoreOfParentheses(String s) {
        return helper(s);
    }
    
    public int helper(String s) {
        //what is the base case -> (), s is always balanced
        if( s.equals("()") ){
            return 1;
        }
        

        int counter = 1; //counter for finding closing paren
        String temp; //checks for paren value
        
        if(s.length() != 0) {
            
            //find the closing paren for first paren
            for(int i = 1; i < s.length(); i++){
                temp = s.substring(i, i+1);
                counter += calcScore(temp);
                
                //when the closing paren is found...
                if(counter == 0){
                    
                    //if closing parenthesis isn't in last position
                    if(i < s.length()-1){ 
                        //example of A + B
                        return helper(s.substring(0, i+1)) + helper(s.substring(i+1));
                        
                    } else { // example of (A)

                        return 2 * helper(s.substring(1, s.length()-1));
                    }
                    
                }
                      
                
            }
        }

        return 0; //this should never happen!
        
    }

    //calculate whether a character is a '(' or ')'.
    public int calcScore(String s) {
        if( s.equals("(") ){
            return 1;
        } else { //closing bracket
            return -1;
        } 
            
    }
    
}
