class Solution {
    public int nextGreaterElement(int n) {
        
        //Convert Integer to String.
        StringBuilder str = new StringBuilder(n + "");
        
        
        //find the dip (dip is the index when the value of starts to fall while traversing from right -> left. )
        int i = str.length()-1;
        while(i > 0) {
            if(str.charAt(i-1) >= str.charAt(i)) {
                i--;
            }
            else {
                //dip
                break;
            }
        }
        
        if(i == 0) {
            //no dip
            return -1;
        }
        
        int j = i-1;
        int jl = -1;
        
        
        //Again traverse from last index to the dip and find the immediate greater element than the dip.
        for(int k = str.length()-1; k >= j+1;k--) {
            if(str.charAt(k) > str.charAt(j)) {
                jl = k;
                break;
            }
        }
        
        //Swap the dip and the just greater element than the dip.
        swap(str,j,jl);
        
        
        //append the part before the dip as it is and the reverse(and then append) the part after the dip
        StringBuilder sb = new StringBuilder("");
        sb.append(str.substring(0,j+1));
        
        for(int k = str.length()-1; k >= j+1;k--) {
            sb.append(str.charAt(k));
        }
        
        long res =  Long.parseLong(sb.toString());
        
        if(res > Integer.MAX_VALUE) {
            return -1;
        }
        
        return (int)(res);
    }
    
    
    //defining the swap
    public static void swap(StringBuilder str, int i,int j) {
        char chi = str.charAt(i);
        char chj = str.charAt(j);
        
        str.setCharAt(i,chj);
        str.setCharAt(j,chi);
    }
}