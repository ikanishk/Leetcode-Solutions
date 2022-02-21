class Solution {
    //Kadane's algorithm
    public int maxSubArray(int[] arr) {
      int csum=arr[0];
      int bsum=arr[0];
        
    for(int i=1;i<arr.length;i++){
    if(csum>0){
    csum+=arr[i];
    }
    else{
    csum=arr[i];
    }
    
    if(csum>bsum){
        bsum=csum;
    }
    }
    return bsum;
    }
}



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int pre = 0, maxAns = nums[0];
//         for (int num : nums) {
//             pre = Math.max(pre + num, num);
//             maxAns = Math.max(maxAns, pre);
//         }
//         return maxAns;
//     }
// }