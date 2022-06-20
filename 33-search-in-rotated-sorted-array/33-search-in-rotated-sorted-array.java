class Solution {
     //The approach is to use Binary Search in order to eliminate the halves of the array where the element can definitely not be present and perform a search in a logarithmic time.
        public int search(int[] nums, int target) {
       
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo <= hi) {
            int mid = (lo + hi)/2;
            
            if(nums[mid] == target) {
                return mid;
            }
            
            //Check if lo to mid(left half) is sorted.
            else if(nums[lo] <= nums[mid]) {
                
                if(nums[lo] <= target && target <= nums[mid]) {
                    hi = mid-1;
                }
                else {
                    lo = mid+1;
                }
            }
            
            else if(nums[mid] <= nums[hi]){
                // check if mid to hi is sorted
                if(nums[mid] <= target && target <= nums[hi]) {
                    lo = mid+1;
                }
                else {
                    hi = mid-1;
                }
            }
            
        }
        
        return -1;
        
    }
}