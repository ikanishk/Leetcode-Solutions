class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar = Integer.MIN_VALUE;
        int maxendhere = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            maxendhere += nums[i];
            if(maxendhere > maxsofar)
                maxsofar = maxendhere;
            if(maxendhere < 0)
                maxendhere = 0;
        }
        return maxsofar;
    }
}