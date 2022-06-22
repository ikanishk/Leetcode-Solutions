class Solution {
    public int findKthLargest(int[] arr, int k) {
     	
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
	    ArrayList<Integer>ans=new ArrayList<>();
	    for(int i=0;i<arr.length;i++) {
	    	p.add(arr[i]);
	    }
	    for(int i=0;i<k;i++) {
	    ans.add(p.peek());
	    p.remove();
	    }
	   return ans.get(k-1);
    }
}

