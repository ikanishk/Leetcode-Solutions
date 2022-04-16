class Solution {
 public List<List<String>> groupAnagrams(String[] strs) {
     //point to remember : Not everything can become a hasmap key, it should have a equals() and hashcode() function to do so.
        HashMap<HashMap<Character,Integer>,ArrayList<String>>map = new HashMap<>(); //fmap vs arraylist
        
        for(int i=0; i < strs.length;i++) {
            String str = strs[i];
            HashMap<Character,Integer>fmap = new HashMap<>();
            
            //create fmap
            for(int j=0; j < str.length();j++) {
                char ch = str.charAt(j);
                
                int nf = fmap.getOrDefault(ch,0) + 1;
                fmap.put(ch,nf);
            }
            
            if(map.containsKey(fmap) == false) {
                ArrayList<String>list = new ArrayList<>();
                list.add(str);
                map.put(fmap,list);
            }
            else {
                ArrayList<String>list = map.get(fmap);
                list.add(str);
            }
        }
        
        
        List<List<String>>ans = new ArrayList<>();
        
        for(HashMap<Character,Integer>key : map.keySet()) {
            ans.add(map.get(key));
        }
        
        return ans;
    }
}