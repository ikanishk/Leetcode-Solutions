class Solution {
    public int minScoreTriangulation(int[] arr) {
    	   int [][]dp=new int[arr.length][arr.length];
    for(int gap=2;gap<arr.length;gap++){
      for(int si=0,ei=gap;ei<arr.length;si++,ei++){  //The first 2 loops are for the diagonal(gap) traversal in the matrix.
        int min=Integer.MAX_VALUE;
        for(int cp=si+1;cp<ei;cp++){ //This loop is to find minimum of all the applied cuts in all sub-matrices (si -> ei); 
        min=Math.min(min,dp[si][cp]+dp[cp][ei]+arr[si]*arr[ei]*arr[cp] );
        }
        dp[si][ei]=min;
      }
    }

		return dp[0][arr.length-1];    
    }
}