class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] end_idx = new int[26];
        for(int i = 0; i < S.length(); ++i)
            end_idx[S.charAt(i) - 'a'] = i;
        
        List<Integer> result = new ArrayList();
        int start = 0, end = 0;
        for(int i = 0; i < S.length(); ++i){
            end = Math.max(end, end_idx[S.charAt(i) - 'a']);
            if(i == end){ // all the characters of current partition included
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}