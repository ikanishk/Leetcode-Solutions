class Solution {
    public int firstMissingPositive(int[] nums) {
		//set any 0 or negative number as the size of the array + 1
		//[1,2,*-3*,4] => [1,2,*5*,4]
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }
        
		//if the absolute value is a valid position of this array, then 
		//negate the value of the respective index
		// [1,2,5,4] =>  [-1,-2,5,-4]
        for(int i = 0; i < nums.length; i++) {
            int valueIdx = Math.abs(nums[i]) - 1;
            if(valueIdx + 1 > 0 && valueIdx + 1 <= nums.length) {
                nums[valueIdx] = -Math.abs(nums[valueIdx]);
            }
        }
        
		//traverse the array from left to right
		//if there's any positive number then
		//we found the missing positive number
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= 1) {
                return i + 1;
            }
        }
        
		//if all elements of the array are correct
		//return the lenght of the array + 1
        return nums.length + 1;
    }
}