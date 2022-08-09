class Solution {
    public int numIslands(char[][] arr) {
    int count=0;
      boolean[][]visited=new boolean[arr.length][arr[0].length];
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
         if((arr[i][j]-'0')==1 && visited[i][j]==false){
            drawtreeforcomp(arr,i,j,visited);
            count++;
         }
         }
      }
      return count;
    }
    
public static void drawtreeforcomp(char[][]arr,int i,int j,boolean[][]visited){
   if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]-'0'==0 ||visited[i][j]==true){
      return;
   }

   visited[i][j]=true;
   drawtreeforcomp(arr,i-1,j,visited);
   drawtreeforcomp(arr,i,j-1,visited);
   drawtreeforcomp(arr,i+1,j,visited);
   drawtreeforcomp(arr,i,j+1,visited);
   // visited[i][j]=false; No need to make the vertex false again as it now belongs to a component and should not be revisited.


   }
}