class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        int ans = 0;
        for(int i=0; i<s.length();i++){
            int c = s.charAt(i) - 'a';
            arr[c]++;
            ans++;
        }
        for(int i=0; i<t.length();i++){
            int c = t.charAt(i) - 'a';
            if(arr[c]>0){
                arr[c]--;
                ans--;
            }else{
                ans++;
            }
        }
        return ans;
    }
}