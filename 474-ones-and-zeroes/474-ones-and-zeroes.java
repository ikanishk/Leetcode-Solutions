class Solution {
    int[] zeroes;
    int[] ones;
    int[][][] dp;
    
    public int findMaxForm(String[] strs, int m, int n) {
        // knapsack
        // set of remaining strings, m, n -> largest subset
        dp = new int[m+1][n+1][strs.length];
        zeroes = new int[strs.length];
        ones = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            zeroes[i] = getCount(strs[i], '0');
            ones[i] = getCount(strs[i], '1');
        }
        return combinations(m, n, 0);
        
    }
    
    private int combinations(int m, int n, int index) {
        if (m < 0 || n < 0) {
            return -1;
        }
        if (index >= zeroes.length) {
            return 0;
        }
        if (dp[m][n][index] != 0) {
            return dp[m][n][index];
        }
        int subsetCount = Math.max(1+combinations(m-zeroes[index], n-ones[index], index+1), combinations(m, n, index+1));
        dp[m][n][index] = subsetCount;
        return subsetCount;
    }
    
    private int getCount(String s, char bit) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (bit == c) {
                count += 1;
            }
        }
        return count;
    }
}