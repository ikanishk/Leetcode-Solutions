class Solution {
    
    //The thought is that the minimum element would be the only one who is less than its previous in a sorted array.
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
         if(nums[i]<nums[i-1]){
             min= nums[i];
         }
       }
        return min;
    }
}