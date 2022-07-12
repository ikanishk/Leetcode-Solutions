class Solution {
    public int coinChange(int[] c, int a) {
        int k=c.length;
        int b[][]=new int[k+1][a+1];
        for(int i=0;i<=a;i++)
        {
            b[0][i]=10001;//Infinity Value
        }
        for(int i=0;i<=k;i++)
        {
            b[i][0]=0;
        }
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=a;j++)
            {
            if(c[i-1]>j) //If the current denomination is greater than the amount, we exclude the current coin.
                {
                    b[i][j]=b[i-1][j];
                }
                else
                {
                    b[i][j]=Math.min(b[i-1][j],1+b[i][j-c[i-1]]);
                }
            }
        }
        return b[k][a]==10001 ? -1 : b[k][a];
    }
}