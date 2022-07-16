class Solution {
    public int lengthOfLIS(int[] arr) {
    int[]dp=new int[arr.length];
    
    dp[0]=1;
    for(int i=1;i<arr.length;i++){
    int max=0;
    for(int j=0;j<i;j++){
        if(arr[j]<arr[i]){

        max=Math.max(max,dp[j]);
    }
    }
    dp[i]=1+max;
    }
    int max=0;
    for(int i=0;i<arr.length;i++){
    max=Math.max(dp[i],max);
    }
    return max;
    }
    

}