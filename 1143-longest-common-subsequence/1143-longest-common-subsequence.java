class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][]dp=new int[s1.length()+1][s2.length()+1];

        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[i].length-2;j>=0;j--){
             
                //if both characters match, then add 1 to the diagonal
                //if they don't match take the max of the immediate right and down.
                if(s1.charAt(i)==s2.charAt(j)){
                dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);      
                }
              }
                }
                return( dp[0][0]);
    }
}  
