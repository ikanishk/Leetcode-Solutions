class Solution {
    
    
        public static class Pair implements Comparable<Pair>{
        int prime;
        int ptr;
        int val;
        
        Pair() {
            
        }
        
        Pair(int prime,int ptr,int val) {
            this.prime = prime;
            this.ptr = ptr;
            this.val = val;
        }
        
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
        
    }
    
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[]dp = new int[n+1];
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        
        for(int i=0; i < primes.length;i++) {
            Pair p = new Pair(primes[i],1,primes[i]*1);
            pq.add(p);
        }
        
        dp[1] = 1;
        
        for(int i=2; i <= n;) {
            Pair top = pq.remove();
            
            if(dp[i-1] != top.val) {
                dp[i] = top.val;
                i++;
            }
            
            int np = top.ptr + 1;
            int nv = (top.prime)*(dp[top.ptr]);
            
            pq.add(new Pair(top.prime,np,nv));
            
        }
        
        return dp[n];
    }
}