class Solution {
    public int[][] kClosest(int[][] points, int K) {
        if(K == points.length) return points;
        
        //create a PQ witha comparator that puts the greates Euclid distance at the top so that we can remove it when the PQ size exceeds k.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
            
       
        
        for(int[] point: points) {
            pq.add(point);
            if(pq.size() > K) pq.poll();
        }
        return pq.toArray(new int[0][0]);
    }
}