class Solution {
    public boolean matchReplacement(String s, String sub, char[][] mp) {
        // HashMap; Tc: O(m*n); SC: O(128*128)
        int[][] arr = new int[128][128];
        int m=sub.length(), n=s.length();
        for(int i=0; i<m; i++) arr[sub.charAt(i)][sub.charAt(i)]=1;
        for(char[] v: mp) arr[v[1]][v[0]]=1;
        for(int i=0; i+m<=n; i++) {
            int f=1;
            for(int j=0; j<m; j++) {
                if(arr[s.charAt(j+i)][sub.charAt(j)]==0) {
                    f=0;
                    break;
                }
            }
            if(f==1) return true;
        }
        return false;
    }
}