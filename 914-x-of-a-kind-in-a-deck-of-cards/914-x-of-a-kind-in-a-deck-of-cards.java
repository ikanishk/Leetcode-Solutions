class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i < deck.length;i++) {
            int nf = map.getOrDefault(deck[i],0) + 1;
            map.put(deck[i],nf);
        }       
        int maplength=0;
                for(int key:map.keySet()){
                maplength++;
                }
        int[]arr=new int[maplength];
        int ans=0;
        for(int key:map.keySet()){
        ans=gcd(ans,map.get(key));
        }
        
        if(ans>=2){
        
            return true;
            
        }
        return false;

    }
    
        static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}