class Solution {
    public int rob(int[] nums) {
    int n=nums.length;
     int inc = 0;
     int exc = 0;
     
     for(int i=1; i <=n;i++) {
         int ninc = exc+nums[i-1];
         int nexc = Math.max(inc,exc);
         
         inc = ninc;
         exc = nexc;
     }
     
     int total = Math.max(inc,exc);
     
     
     
     return total;
    }
}