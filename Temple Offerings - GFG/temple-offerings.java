// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0; i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.offerings(N, arr));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int offerings(int n, int height[]){
    //Create a leftarray(larr) and iterate it from left -> right such that the value increases as the temple height and reset it to 0 whenever the height declines.
     int[]larr=new int[n];
     larr[0]=1;
     for(int i=1;i<height.length;i++){
     if(height[i]>height[i-1]){
     larr[i]=larr[i-1]+1;
     }
     
     else{
     larr[i]=1;
     }
     }
         //Create a rightarray(rarr) and iterate it from right -> left such that the value increases as the temple height and reset it to 0 whenever the height declines.

     int[]rarr=new int[n];
     rarr[height.length-1]=1;
     for(int i=height.length-2;i>=0;i--){
     if(height[i]>height[i+1]){
     rarr[i]=rarr[i+1]+1;
     }
     
    else{
     rarr[i]=1;
     }
     }
     

     //Now we add all the maximum heights at all respective points of the height array and add them up to get the answer.
     int ans=0;
     for(int i=0;i<height.length;i++){
     ans+=Math.max(larr[i],rarr[i]);    
     }
     return ans;
    }
}