class Solution {
    //Moore's Voting Algorithm
    public int majorityElement(int[] nums) {
    int val=nums[0];
    int count=1;
    
    for(int i=1;i<nums.length;i++){
    if(nums[i]==val){
    count++;
    }
    else{
    count--;
    }
    
    //count==0 means all the elements till now have cancelled each other. So, we need to reassign nums[i] as the supposed Majority Element.
    if(count==0){
    val=nums[i];
    count=1;
    }
    }
    return val; //Since, it's given that a majority element will always exists. Hence, we returned val directly. Otherwise, we would check it's frequency for being >n/2.
    // int f=0;    
    // for(int i=0;i<nums.length;i++){
    // if(nums[i]==val){
    // f++;
    // }
    // }
    // if(f>nums.length/2){
    // return f;
    // }
    }
}