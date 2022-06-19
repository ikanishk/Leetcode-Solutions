class Solution {
    
    // Take all zeros and as many ones as possible from right to left.
    
    //Iterate from right -> left.
    //Include all zeroes as they don't contribute.
    //When encounter a '1', the value till that point is 2^(j-1) where j is the distance from the last element.
    public int longestSubsequence(String s, int k) {
        int sum = 0;
        int numOfOnes = 0;
        int numOfZeros = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '0') {
                numOfZeros++;
            }
            else {
                sum += Math.pow(2, s.length() - 1 - i);
                if (sum <= k) {
                    numOfOnes++;
                }
            }
        }
        return numOfOnes + numOfZeros;
    }
}