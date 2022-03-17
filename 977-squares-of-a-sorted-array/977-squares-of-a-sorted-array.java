class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]arr=new int[nums.length];
        
        //make two pointers (i and j) at 0 and arr.length-1.
        
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;// this is the location where the largest of i and j squares will be filled.

        //find the largest square amongst element at i and j.
        while(i<=j){
        if(nums[i]*nums[i]<=nums[j]*nums[j]){
        arr[k]=nums[j]*nums[j];
        j--;
        }
        
        else{
        arr[k]=nums[i]*nums[i];
        i++;
        }
        
        k--;
        }
        
        return arr;
    }
}