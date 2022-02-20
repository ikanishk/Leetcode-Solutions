class Solution {
    public int minCut(String s) {
        
        // firstly create a boolean array to store the (true/false) status of all substrings
              boolean[][] dp1 = new boolean[s.length()][s.length()];
        
        //traverse the array and store the true/false status.
        for (int g = 0; g < dp1.length; g++) {
            for (int i = 0, j = g; j < dp1.length; i++, j++) {
                
                if (g==0) {
                    dp1[i][j] = true;
                }

                else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp1[i][j] = true;
                    }
                }

                else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (dp1[i + 1][j - 1] == true) {
                            dp1[i][j] = true;
                        }
                    }
                    else {
                        dp1[i][j] = false;

                    }
                }

            }
        }
        
        //Prefix loop(which checks whether the substring is pallindromic, if yes, then it removes the subsstring and checks for the minimum cuts possible in the remaining array.)
        int[]strg=new int[s.length()];
        strg[0]=0;
        
        for(int j=1;j<strg.length;j++){
            if(dp1[0][j]){
                strg[j]=0;
            }
            
            else{
                int min=Integer.MAX_VALUE;
                for(int i=j;i>=1;i--){
                    if(dp1[i][j]){
                        if(strg[i-1]<min){
                            min=strg[i-1];
                        }
                    }
                }
                strg[j]=min+1;
            }
        }
    return strg[strg.length-1];  
    }
}