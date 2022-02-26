class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
    int[]pointers=new int[primes.length];
    int[]dp=new int[n+1];
    
    dp[1]=1;
        
    for(int i=0;i<pointers.length;i++){
    pointers[i]=1;
    }
        
    for(int i=2;i<=n;i++){
    Integer[]product=new Integer[pointers.length];
    for(int j=0;j<product.length;j++){
    product[j]=primes[j]*dp[pointers[j]];
    }
    int min = Collections.min(Arrays.asList(product));
    dp[i]=min;
        for(int j=0;j<product.length;j++){
        if(product[j]==min){
        pointers[j]++;
        }
        }
    }
        return dp[n];
    }
}