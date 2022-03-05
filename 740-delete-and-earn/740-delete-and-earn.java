class Solution {
public int deleteAndEarn(int[] nums) {

    Arrays.sort(nums);
    
    int[] dp=new int[nums.length];
    
    dp[0]=nums[0];
    int max=nums[0];
    for(int i=1;i<nums.length;i++){

       if(nums[i-1]==nums[i]){
           dp[i]=nums[i]+dp[i-1];
       }
        else{
            int j=i-1;
            while(j>=0 && nums[j]==nums[i]-1){
                j--;
            }
            
            if(j==-1){
                dp[i]=nums[i];
            }
            else{
                int max1=nums[j];
                while(j>=0){
                    max1=Math.max(max1,dp[j--]);
                }
                dp[i]=max1+nums[i];
                
            }
        }
        max=Math.max(dp[i],max);
    }
    
   
    return max;
}
}