class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        // The graph given in the example can be interpreted as follows:
        //
        //        3
        //    0.5   0.5
        // 0      0      0
        //
        // This means 1d dp is enough.
        // Going backward so that we don't overwrite needed data.
        // It is basically 119. pascal triangle II
        // https://leetcode.com/problems/pascals-triangle-ii/

        double[] dp = new double[101];
        dp[1] = --poured;
        for (int i = 1; i <= query_row; i++){
            for (int j = i + 1; j > 0; j--){
                dp[j] = (Math.max(dp[j], 0) + Math.max(dp[j - 1], 0)) / 2 - 1;
            }
        }
        return Math.min((dp[++query_glass] + 1), 1);
    }
}