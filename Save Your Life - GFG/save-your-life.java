//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends

 class Solution
{
    static String maxSum(String w,char x[],int b[], int n){
        // hash the position of characters
        int hash[] = new int[500];
        for(int i=0;i<n;i++)
        {
            hash[(int)x[i]]=i+1;
        }
        
        // intialize the maximum sum so far as zero
        int max_so_far=0,max_ending_here=0;
        
        int start=0,end=0,s=0;
        
        char k=w.charAt(0);
        
        // update the max sum so far as first charcter ascii value
        if(hash[k]==0)
            max_so_far=(int)k;
        else
            max_so_far=b[hash[k]-1];
        
        // Kadane's Algorithm
        for(int i=0;i<w.length();i++)
        {
            char d=w.charAt(i);
            if(hash[d]==0)
            {
                max_ending_here+=(int)d;
            }
            else
            {
                max_ending_here+=b[hash[d]-1];
            }
            
            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
     
            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i+1;
            }
        }
        
        // Find the substring from start to end
        String ans = "";
        for(int i = start;i<=end;i++)
        {
            ans += w.charAt(i);
        }

        return ans;  
    }
}   


//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends