class Solution {
    public int minSteps(String s, String t) {
        int[] firstCharacter = new int[26];
        int[] secondCharacter = new int[26];
        int steps = 0;
        for(int i = 0 ;i < s.length() ; i++){
            firstCharacter[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0 ;i < t.length() ; i++){
            secondCharacter[t.charAt(i) - 'a'] += 1;
        }
        for(int i = 0 ;i < firstCharacter.length ; i++){
            if(firstCharacter[i]  != secondCharacter[i]){
                steps += Math.abs(firstCharacter[i] - secondCharacter[i]);
            }
        }
        return steps;
    }
}