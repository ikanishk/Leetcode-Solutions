class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Arrays.sort(nums);
        int count=1;
        int temp = 0;
        for(int i=0;i<nums.length-1;i++){
            if(count > n) return nums[i];
            if(nums[i] == nums[i+1]) {
                temp = i;
                count++;
            }
            else count=1;
        }
        return nums[temp];
    }
}