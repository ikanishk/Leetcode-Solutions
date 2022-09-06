// The idea of this solution is using DFS to detect cycles.

// Each node has 3 states: unknown, visiting, safe. There exists a cycle only when we are visiting node A's neighbours and find node A again. If we find a cycle, we mark all nodes on this cycle and those nodes which can point to this cycle as unsafe.

// Time Complexity: O(V + E)
// Space Complexty: O(V + E)

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] safeNode = new int[graph.length];
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < graph.length; i++){
            if(dfs(graph, i, safeNode)){
               res.add(i);
            }
        }
        return res;

    }

    public boolean dfs(int[][] graph, int currentNode, int[] safeNode){
        if(safeNode[currentNode] == 2){
            return true;
        }
        if(safeNode[currentNode] == 1){
            return false;
        }

        safeNode[currentNode] = 1;
        int[] edge = graph[currentNode];
        for(int i = 0; i < edge.length; i++){
            if(!dfs(graph, edge[i], safeNode)){
                return false;
            }
        }
        safeNode[currentNode] = 2;
        return true;
    }
}