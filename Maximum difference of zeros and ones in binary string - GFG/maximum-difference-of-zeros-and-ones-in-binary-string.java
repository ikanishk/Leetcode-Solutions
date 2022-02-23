// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String str) {
     
	   int[]nums=new int[str.length()];
	   for(int i=0;i<nums.length;i++){
	   if(str.charAt(i)=='0'){
	   nums[i]=1;    
	   }
	   else{
	   nums[i]=-1;
	   }
	   
	   
	   }
	   int pre = 0, maxAns = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
	
    }
}