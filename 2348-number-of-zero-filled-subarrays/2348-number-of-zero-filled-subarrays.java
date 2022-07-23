class Solution {
    // Count consecutive zeroes
    // For any array of length n the number of possible subarrays= n(n+1)/2
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] == 0)
                res += r-l+1;  // while adding one element, the total number of subarrays will add r-l+1
            else
                l = r + 1;  // left should move to the next 0
        }
        return res;
    }
}