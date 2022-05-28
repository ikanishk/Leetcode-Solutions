class Solution {
    public int missingNumber(int[] nums) {
    int ex=((nums.length)*(nums.length+1))/2;  //multiply the (length of array) and (length of                                                  array+1).
    int sum=0;
        
    for(int i=0;i<=nums.length-1;i++){
    sum=sum+nums[i];                         //find out the aggregate sum of the array.
    }
        
    return ex-sum;
    }
}