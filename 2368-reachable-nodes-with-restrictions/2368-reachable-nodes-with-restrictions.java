class Solution {
private final Set<Integer> reachableSet = new HashSet<>(List.of(0));

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Set<Integer> restrictedNodes = Arrays.stream(restricted).boxed().collect(Collectors.toSet());
        Map<Integer, List<Integer>> nodes = new HashMap<>();

        for (int[] edge : edges) {
            nodes.computeIfAbsent(edge[0], value -> new ArrayList<>()).add(edge[1]);
            nodes.computeIfAbsent(edge[1], value -> new ArrayList<>()).add(edge[0]);
        }

        dfs(nodes, 0, restrictedNodes, new HashSet<>());
        return reachableSet.size();
    }

    private void dfs(Map<Integer, List<Integer>> nodes, int current, Set<Integer> restricted, Set<Integer> seen) {
        for (int node : nodes.get(current)) {
            if (!restricted.contains(node) && !seen.contains(node)) {
                reachableSet.add(node);
                seen.add(node);
                dfs(nodes, node, restricted, seen);
            }
        }
    }
}