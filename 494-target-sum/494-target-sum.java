class Solution {
            int aux(int[] nums, int i, int sum, int S){
                if(i==nums.length){
                    if(S == sum)return 1;
                    return 0;
                }
                //All Positives 
                int pos=aux(nums,i+1,sum+nums[i],S);
                //All Negatives
                int neg=aux(nums,i+1,sum-nums[i],S);
                
                return pos + neg;
            }
    public int findTargetSumWays(int[] nums, int S) {
            return aux(nums,0,0,S);
    }
}