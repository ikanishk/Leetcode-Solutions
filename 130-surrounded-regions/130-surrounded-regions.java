//The approach involves traversing all boundaries and running a "DFS" on all Os and mark their connections as 
 //   visited. Now see what zeroes are left and convert them to "X".
class Solution {
public void solve(char[][] board) {

    if(board.length==0)
        return;
    
    // this for loop handles all boundary condition in 1st & last row.
    for(int i=0; i<board[0].length ;i++){
        if(board[0][i]=='O')
            DFS(board, 0, i);
        if(board[board.length-1][i]=='O')
            DFS(board, board.length-1, i);
        
    }
    
    // this for loop handles all boundary condition in 1st & last col.
     for(int i=0; i<board.length ;i++){
        if(board[i][0]=='O')
            DFS(board, i, 0);
        if(board[i][board[0].length-1]=='O')
            DFS(board, i, board[0].length-1);
        
    }
            
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board[0].length; j++){
            
           if(board[i][j]=='O')
               board[i][j]='X';
            
            if(board[i][j]=='#')
                board[i][j]='O';
        }
    }
}

private void DFS(char[][]board, int i, int j){
    
    if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O')
            return;
   
    board[i][j]= '#';
        
    DFS(board, i+1, j);
    DFS(board, i-1, j);
    DFS(board, i, j-1);
    DFS(board, i, j+1);
    }
}