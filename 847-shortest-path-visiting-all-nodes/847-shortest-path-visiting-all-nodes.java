class Solution {
    public class pair{
        int node;
        int mask;
        pair(int node , int mask){
            this.node = node;
            this.mask = mask;
        }
    }
    
    public int shortestPathLength(int[][] graph) {
        int size =  graph.length;
        int target = (1<<size)-1;//<<4 will shift 1 4 times ahead -> 10000 and then -1(11111111) so when we do 
        //10000 - 11111 = 01111 and this is our target to visit all nodes 0th posn for 0th node and 1 posn for 1st node
        
        boolean[][] visited = new boolean[size][target];//to check we are not visiting in cycles
        Queue<pair> q = new ArrayDeque<>();
        
        //now we are going to do BFS Traversal so add all the nodes intially with their mask
        for(int i = 0; i < size; i++){
            q.add(new pair(i , (1<<i)));//for 0th node 1 , 1node 10 and likewise for all
        }
        
        int steps = 0;//this will keep a count for steps 
        while(!q.isEmpty()){
            int cuurentInQueue = q.size();
            
            while(cuurentInQueue-- > 0){//this is only one step or level
                pair remove = q.poll();
                if(remove.mask == target){//check everytime if the mask is equal to target if it is then
                    return steps;//return directly step
                }
                int node = remove.node;
                int mask = remove.mask;
                if(visited[node][mask] == true){
                    continue;//if already processed before then means we are in cycle so leave it
                }
                
                visited[node][mask] = true;//mark it as visited
                
                for(int nbr : graph[node]){//add all the neighbours for the current node
                    q.add(new pair(nbr , mask | (1<<nbr)));//and also add the new mask 
                }//suppose we removed 0 with 1 and adding 1 then 1<<1 (10) so add 1|10=11 as 0 and 1 visited 
                
            }
            steps++;//increase the step after each level only
        }
        return -1;
    }
}