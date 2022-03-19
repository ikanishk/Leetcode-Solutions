class Solution {
    public int halveArray(int[] nums) {
        Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        double sum = 0;
        for (int i : nums) {
        	sum += i;
        	q.add((double)i);
        }
        sum /= 2;
        while (sum > 0) {
        	double d = q.poll();
        	sum -= d / 2;
        	q.add(d / 2);
        	res++;
        }
        return res;
    }
}