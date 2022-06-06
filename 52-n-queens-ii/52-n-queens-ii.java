class Solution {
    private int solutions;
    
    public int totalNQueens(int n) {
        solutions = 0;        
        
        helper(0, 
               new boolean[n], 
               new boolean[2*n-1], 
               new boolean[2*n-1]);
        
        return solutions;
    }
    
    private void helper(int r, 
                        boolean[] cols, 
                        boolean[] d1, 
                        boolean[] d2) {
        int n = cols.length;
        
        if (r == n) {
            solutions++;
            return;
        }
        
        for (int c = 0; c < n; c++) {
            int id1 = r + c;
            int id2 = r - c + n - 1;
            if (!cols[c] && !d1[id1] && !d2[id2]) {
                cols[c] = d1[id1] = d2[id2] = true;
                helper(r+1, cols, d1, d2);
                cols[c] = d1[id1] = d2[id2] = false;
            }            
        }
    }
}