class Solution {
    static class Pair implements Comparable<Pair>{
        char ch;
        int freq;
        public Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
        public int compareTo(Pair o){  
            return o.freq-this.freq;    
        }  
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        //create Frequency map
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i);
            int count = map.getOrDefault(ch, 0) + 1;
            // Impossible to form a solution if count is greater then half of the string length
            if (count > (s.length() + 1) / 2) return "";
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        //add to heap
        for(Character key:map.keySet()){
            pq.offer(new Pair(key,map.get(key)));
        }
        //create answer here
        StringBuilder sb=new StringBuilder();
        Pair hold=pq.poll();
        //need to add characters alternatively so we can make an valid answer
        sb.append(hold.ch);
        hold.freq--;
        while(!pq.isEmpty()){
            //create will add an character to sb
            Pair create=pq.poll();
            sb.append(create.ch);
            create.freq--;
            if(hold.freq>0){
                pq.offer(hold);
            }
            hold=create;
            //then we need to hold create variable for 1 itreation so to make a valid answer 
        }
        return sb.toString();
    }
}