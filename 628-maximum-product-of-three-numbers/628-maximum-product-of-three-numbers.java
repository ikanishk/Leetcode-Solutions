class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length==3){
        return nums[0]*nums[1]*nums[2];
        }
        Arrays.sort(nums);
        int prod1=1;
        for(int i=nums.length-1;i>nums.length-4;i--){
        prod1=prod1*nums[i];
        }
        
        int prod2=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(prod1,prod2);
    }
}