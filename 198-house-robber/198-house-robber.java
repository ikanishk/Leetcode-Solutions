// class Solution {
//     public int rob(int[] nums) {
//     int n=nums.length;
//      int inc = 0;
//      int exc = 0;
     
//      for(int i=1; i <=n;i++) {
//          int ninc = exc+nums[i-1];
//          int nexc = Math.max(inc,exc);
         
//          inc = ninc;
//          exc = nexc;
//      }
     
//      int total = Math.max(inc,exc);
     
     
     
//      return total;
//     }
// }

class Solution {
public int rob(int[] num) {
    int rob = 0; //max monney can get if rob current house
    int notrob = 0; //max money can get if not rob current house
    for(int i=0; i<num.length; i++) {
        int currob = notrob + num[i]; //if rob current value, previous house must not be robbed
        notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
        rob = currob;
    }
    return Math.max(rob, notrob);
}
}