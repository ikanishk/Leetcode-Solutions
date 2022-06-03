class NumMatrix {
    int[][] m ; 
    
    public NumMatrix(int[][] matrix) {
        int l=matrix.length, b=matrix[0].length;
        m = new int[l][b];
        
        for (int i = 0; i < l; ++i) 
             System.arraycopy(matrix[i], 0, m[i], 0, b);
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        
        for( int i=row1 ; i<=row2 ; i++ )
            for( int j=col1 ; j<=col2 ; j++)
                sum+=m[i][j];
                
        return sum;
    }
}