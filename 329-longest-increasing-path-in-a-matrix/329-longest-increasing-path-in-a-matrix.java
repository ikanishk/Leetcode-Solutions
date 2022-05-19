class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int res=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        boolean[][] vis=new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res=Math.max(res,dfs(dp,matrix,vis,i,j));
            }
        }
        return res;
    }
    
    public int dfs(int[][] dp,int[][] matrix,boolean[][] vis,int row,int col){
        if(dp[row][col]!=0)
            return dp[row][col];
        
        int[][] dxy=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        int dist=1;
        for(int[] d:dxy){
            int x=d[0]+row;
            int y=d[1]+col;
            
            if(x<matrix.length && y<matrix[0].length && x>=0 && y>=0 && !vis[x][y] && matrix[x][y]>matrix[row][col]){
                vis[x][y]=true;
                dist=Math.max(dist,dfs(dp,matrix,vis,x,y)+1);
                vis[x][y]=false;
            }
        }
        
        dp[row][col]=dist;
        return dist;
    }
}
