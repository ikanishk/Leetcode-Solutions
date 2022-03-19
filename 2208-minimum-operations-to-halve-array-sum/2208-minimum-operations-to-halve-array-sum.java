class Solution {
    public int halveArray(int[] nums) {
        long sum = 0;
        
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int num : nums) {
            sum += num;
            pq.add(Double.valueOf(num));
        }
        
        double half = sum / 2.0;
        
        double reduction = 0;
        
        int steps = 0;
        
        while(reduction < half) {
            double max = pq.poll();
            max = max / 2.0;
            reduction += max;
            pq.add(max);
            steps++;
        }
        
        return steps;
    }
}