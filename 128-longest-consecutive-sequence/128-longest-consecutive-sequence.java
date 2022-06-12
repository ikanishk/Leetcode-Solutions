class Solution {
    public int longestConsecutive(int[] a1) {
     	
		HashMap<Integer,Boolean>lcs=new HashMap<>();
		int n=a1.length;
		for(int i=0;i<n;i++) {
		lcs.put(a1[i],true);
		}
		
		for(int i=0;i<n;i++) {
		if(lcs.containsKey(a1[i]-1)) {
		lcs.put(a1[i],false);
		}
		}
		
		int msp=0;
		int ml=0;
		for(int key:lcs.keySet()) {
			if(lcs.get(key)==true) {
				int sp=key; //start point of sequence
				int l=1; //length of sequence
				while(lcs.containsKey(sp+l)) {
				l++;
				}
				if(l>ml) {
					msp=sp;
					ml=l;
				}
			}
		}
		
    return  ml; 
    }
}