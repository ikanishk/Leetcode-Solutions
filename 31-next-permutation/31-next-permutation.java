class Solution {
    public void nextPermutation(int[] nums) {
        int k=nums.length-2;
        //Find the breakpoint in reverse traversal.
        while(k>=0&&nums[k]>=nums[k+1]) k--;
        if(k<0) reverse(nums,0,nums.length-1);//when the whole array is decreasing, the next perm is the reverse.
       
        else{
            int l=nums.length-1;
            while(nums[l]<=nums[k]) l--;
            int temp = nums[l];
            nums[l] = nums[k];
            nums[k] = temp;
            reverse(nums,k+1,nums.length-1);
        }
    }
    
    private void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }   
}