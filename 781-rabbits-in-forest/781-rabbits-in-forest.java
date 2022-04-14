class Solution {
 public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map = new HashMap<>(); //ans vs count of rabbits
        
     //create a frequency map
        for(int i=0; i < answers.length;i++) {
            int nf = map.getOrDefault(answers[i],0) + 1;
            map.put(answers[i],nf);
        }
        
     //Run a loop on the keyset of all the values and gather all the rabbits in every group and add them up in mr(main result).//
        int mr = 0;
        
        for(int key : map.keySet()) {
            int val = map.get(key);
            int gs = key + 1;
            mr += Math.ceil(val*1.0/gs) * gs;
        }
        
        return mr;
        
    }
}