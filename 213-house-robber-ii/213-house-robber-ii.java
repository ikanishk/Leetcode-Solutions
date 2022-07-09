   class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) return nums[0];
            return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
            //Since the array is circular , 
            //If we take the 0th element, we exlude the last one and vice versa.
        }

       //The rob funtion makes a dp array in which for every i,
       //If we include the ith house, we wiil add dp[i-2]+nums[i].
       //If we exclude the ith house, we will directly pick dp[i-1].
        private int rob(int[] nums, int start, int end) {
            int prevTwo = 0, prevOne = 0, max = 0;
            for (int i = start; i < end; i++) {
                max = Math.max(prevTwo + nums[i], prevOne);
                prevTwo = prevOne;
                prevOne = max;
            }
            return max;
        }
    }