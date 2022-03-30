class Solution {
    public boolean validPalindrome(String s) {
        //We Make 2 pointers i and j.
        int i = 0;
        int j = s.length()-1;
        
        while(i < j) {
            //if we reach a point where str(i) != str(j).
            //then we check that if on deleting the ith and jth character, the remaining string is pallindromic.
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return isPalindromic(s,i+1,j) || isPalindromic(s,i,j-1);
            }
        }
        
        return true;
    }
    
    //function to check pallindrome.
    public static boolean isPalindromic(String str,int i,int j) {
        while(i < j) {
            if(str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        
        return true;
    }
}