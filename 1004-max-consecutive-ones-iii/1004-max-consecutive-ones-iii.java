class Solution {
    public int longestOnes(int[] nums, int k) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        int start = 0;
        int end = 0;
        int zeros = 0;
        int maxCount = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            end++;
            while (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
            maxCount = Math.max(maxCount, end - start);
        }

        return maxCount;
    }
}