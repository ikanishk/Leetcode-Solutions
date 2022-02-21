class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp1 = new boolean[s.length()][s.length()];
        int longg=0;
        int li=0;
            int ri=0;
        for (int g = 0; g < dp1.length; g++) {
            for (int i = 0, j = g; j < dp1.length; i++, j++) {
                
                if (g==0) {
                    dp1[i][j] = true;
                    longg=g+1;
                    li=i;
                    ri=j;
                }

                else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp1[i][j] = true;
                        longg=g+1;
                        li=i;
                        ri=j;
                    }
                }

                else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (dp1[i + 1][j - 1] == true) {
                            dp1[i][j] = true;
                            longg=g+1;
                            li=i;
                            ri=j;
                        }
                    }
                    else {
                        dp1[i][j] = false;

                    }
                }

            }
        }
        return s.substring(li,ri+1);   
    }
}