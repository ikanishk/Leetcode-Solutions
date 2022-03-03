class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        if(arr.length<=2)
            return 0;
        int dp[]=new int[arr.length];
		dp[0]=0;
		dp[1]=0;
        
		for(int i=2;i<arr.length;i++)
		{
		  if(arr[i]-arr[i-1]==arr[i-1]-arr[i-2])
		  {
		      dp[i]=dp[i-1]+1;//number of APs ending at this point 
		  }
		  else
		  dp[i]=0;
		}
		int sum=0;
		for(int i:dp)
		sum+=i;
		
		return sum;
    }
}