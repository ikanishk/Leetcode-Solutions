// class Solution {
//     public int maximumProduct(int[] nums) {
//         if(nums.length==3){
//         return nums[0]*nums[1]*nums[2];
//         }
//         Arrays.sort(nums);
//         int prod1=1;
//         for(int i=nums.length-1;i>nums.length-4;i--){
//         prod1=prod1*nums[i];
//         }
        
//         int prod2=nums[0]*nums[1]*nums[nums.length-1];
//         return Math.max(prod1,prod2);
//     }
// }



class Solution {
    public int maximumProduct(int[] nums) {
        int fmin = Integer.MAX_VALUE; //first min
        int smin = Integer.MAX_VALUE; //second min
        int fmax = Integer.MIN_VALUE; //first max
        int smax = Integer.MIN_VALUE; //second max
        int tmax = Integer.MIN_VALUE; //third max
        
        for(int i=0; i < nums.length;i++) {
            //maintain minimums
            if(nums[i] < fmin) {
                smin = fmin;
                fmin = nums[i];
            }
            else if(nums[i] < smin) {
                smin = nums[i];
            }
            
            //maintain maximums
            if(nums[i] > fmax) {
                tmax = smax;
                smax = fmax;
                fmax = nums[i];
            }
            else if(nums[i] > smax) {
                tmax = smax;
                smax = nums[i];
            }
            else if(nums[i] > tmax) {
                tmax = nums[i];
            }
        }
        
        
        int f1 = fmin * smin * fmax;
        int f2 = fmax * smax * tmax;
        
        return Math.max(f1,f2);
    }
}