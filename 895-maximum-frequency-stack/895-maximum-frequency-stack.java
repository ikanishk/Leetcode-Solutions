class FreqStack 
{
	Queue<int[]> pq;
	int pos = -1;
	HashMap<Integer,Integer> hm = new HashMap<>();
	public FreqStack() 
	{
		pq = new PriorityQueue<>((a,b)->(b[0]-a[0]==0?b[2]-a[2]:b[0]-a[0]));
	}

	public void push(int val) 
	{
		pos++;
		if(hm.containsKey(val))
		{
			pq.add(new int[]{hm.get(val)+1,val,pos});
			hm.put(val,hm.get(val)+1);
		}
		else
		{
			pq.add(new int[]{1,val,pos});
			hm.put(val,1);
		}
	}

	public int pop() 
	{
		int x[] = pq.poll();
		if(x[0]==1)
		{
			hm.remove(x[1]);
			return x[1];
		}
		hm.put(x[1],x[0]-1);
		return x[1];
	}
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */