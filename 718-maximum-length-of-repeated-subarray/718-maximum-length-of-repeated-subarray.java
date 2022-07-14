class Solution {
 public int findLength(int[] A, int[] B) {
        int lenA=A.length, lenB=B.length;
        int[][] dp = new int[lenA][lenB];
    
        int res=0;
        for(int i=0;i<lenA;i++){
            for(int j=0;j<lenB;j++){
                if(A[i]!=B[j]) dp[i][j]=0;
                else{
                    if(i-1>=0 && j-1>=0) dp[i][j]=dp[i-1][j-1]+1;
                    else dp[i][j]=1;
                }
                res = Math.max(res,dp[i][j]);
            }
            
        }
        return res;
    }
}