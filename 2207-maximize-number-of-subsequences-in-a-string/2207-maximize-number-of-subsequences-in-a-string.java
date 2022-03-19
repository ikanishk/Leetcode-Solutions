class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        if(pattern.equals(text)){
            return 2;
        }
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        char x = pattern.charAt(0); char y = pattern.charAt(1);
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            if(c == x){
                temp1.add(i);
            }
            if(c == y){
                temp2.add(i);
            }
        }
        long ans = 0;
        int i = 0; int j = 0;
        while(i < temp1.size() && j < temp2.size()){
            if(temp1.get(i) >= temp2.get(j)){
                j++;
            }
            else{
                ans += (temp2.size() - j);
                i++;
            }
        }
        return ans + Math.max(temp1.size(), temp2.size());
    }
}