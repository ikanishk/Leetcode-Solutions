class Solution {
    final static int MOD = 1000_000_000 + 7;
    int[] arr;
    Map<Integer, Integer> numToIndex;
    public int numFactoredBinaryTrees(int[] arr) {
        numToIndex = new HashMap<>();
        this.arr = arr;
        long[] dp = new long[arr.length];
        Arrays.fill(dp, -1);
        for(int i=0;i<arr.length;i++) numToIndex.put(arr[i], i);
        
        long total = 0;
        for(int i=0;i<arr.length;i++) {
            total += getNumBinaryTrees(arr[i], dp);
        }
        return (int) (total % MOD);
    }
    
    private long getNumBinaryTrees(int num, long[] dp) {
		/// Don't process this number if this number not even present in input `arr`
        if(!numToIndex.containsKey(num)) return 0;
        
        int index = numToIndex.get(num);
		/// if for this `num` we already calculated the result, then return the result
        if(dp[index] != -1) return dp[index];
        
		/// Very beginning single node can form a tree, so initialize count = 1
        long count = 1;
        
        for(int i=0;i<arr.length;i++) {
			// Check if this `arr[i]` is factor of parameter `num` as well as there is other factor `num / arr[i]` present in input 
            if(num % arr[i] == 0 && numToIndex.containsKey(num / arr[i])) {
                count += (getNumBinaryTrees(arr[i], dp) * getNumBinaryTrees(num / arr[i], dp)); 
            }
        }
		/// Update DP with count we found
        dp[index] = count;
        return count;
    }
}