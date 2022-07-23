class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long length = 0;
        long ans = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                length++;
                ans+=length;
            }
            else
                length=0;
        }
        
        return ans;
    }
}