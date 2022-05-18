class Solution {
     static int time=0;
      List<List<Integer>>ans=new ArrayList<>();
    public void dfs(int u,int[]low,int [] par,int[]desc,List<List<Integer>>c){
       
        low[u]=desc[u]=time;
        time++;
        for(int v:c.get(u)){
            if(desc[v]==-1){
                par[v]=u;
                dfs(v,low,par,desc,c);
                low[u]=Math.min(low[u],low[v]);
                if(low[v]>desc[u]){
                    List<Integer>a=new ArrayList<>();
                    a.add(u);
                    a.add(v);
                    ans.add(a);
                }
                
            }
            else if(par[u]!=v){
                low[u]=Math.min(low[u],desc[v]);
            }
        }
        
        
    }
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int low[]=new int[n];
        int par[]=new int[n];
        int desc[]=new int[n];
       List<List<Integer>>g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<Integer>());
        }
        for (List<Integer> conn : connections) {
            g.get(conn.get(0)).add(conn.get(1));
            g.get(conn.get(1)).add(conn.get(0));
        }
        for(int i=0;i<n;i++){
            
            
            low[i]=-1;
            desc[i]=-1;
            par[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(desc[i]==-1){
                dfs(i,low,par,desc,g);
            }
        }
        return ans;
    }
}