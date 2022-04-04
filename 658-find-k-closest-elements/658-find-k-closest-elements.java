class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> b[1]!=a[1] ? b[1] - a[1] : a[0] - b[0]);
		
        //Defined a priority queue which will always keep the maximum diff element in the top of the 
		// queue whenever we find a element with diff smaller we will pop the queue and add the current 
		// element .

        for(int i=0;i<arr.length;i++){
            if(queue.size() == k){
                if(Math.abs(arr[i]-x) < queue.peek()[1]){
                    queue.poll();
                    queue.add(new int[]{i,Math.abs(x-arr[i])});
                }
            }else{
                queue.add(new int[]{i,Math.abs(x-arr[i])});
            }
            
        }
        List<Integer> result = new ArrayList();
        int size = queue.size();
        for(int i=0;i<size;i++){
            result.add(arr[queue.poll()[0]]);
        }
        Collections.sort(result);
        return result;
    }
}