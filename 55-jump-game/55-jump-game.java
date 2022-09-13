// Approach: We mark the maximum reachable index for every element and the moment we are on an index which in greater than the max reachable, we return false and if we are able to successfully parse the entire array and reach the last element, we return true;
class Solution {
public boolean canJump(int[] nums) {
    int reachable = 0;
    for (int i=0; i<nums.length; ++i) {
        if (i > reachable) return false;
        reachable = Math.max(reachable, i + nums[i]);
    }
    return true;
}
}