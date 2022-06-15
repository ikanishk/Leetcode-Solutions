class Solution {
    public int removeDuplicates(int[] nums) {
    //Here we take 2 pointer i and j, j makes sure to traverse with new and unique integers and store a unique copy of every unique element in the ith position.
    int n=nums.length;
    int i=0;
    int j=1;
    if(n<=1){
    return n;
    }
    while(j<=n-1){
      if(nums[i]==nums[j]){
    j++;
    }
    
    else{
    nums[i+1]=nums[j];
    i++;
    j++;
    }    
    }
  
    return i+1;    
    }
}