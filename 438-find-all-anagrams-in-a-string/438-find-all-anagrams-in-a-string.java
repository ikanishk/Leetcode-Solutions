class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        int[] original = new int[26];
        for(char ch : p.toCharArray()) {
            original[ch - 'a']++;
        }
        int len = p.length();
        
        int[] copy = new int[26];
        int currLen = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            int id = s.charAt(i) - 'a';
            copy[id]++;
            currLen++;

            while(start <= i && copy[id] > original[id]) {
                copy[s.charAt(start) - 'a']--;
                start++;
                currLen--;
            }

            if (currLen == len) {
                ans.add(start);
            }
        }
        
        return ans;
    }
}