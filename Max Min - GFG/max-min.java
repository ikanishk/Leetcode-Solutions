//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution
{ 
      
    /* Function to print the second largest 
    elements */
    public static int findSum(int arr[],  
                                     int arr_size) 
    { 
       int max,min;
    	int i;
    	if(arr_size % 2 == 1){
			max = arr[0];
			min = arr[0];
			i = 1;
		}
		else{
			if ( arr[0] < arr[1] ){
				max = arr[1];
				min = arr[0];
			}
			else
			{
				max = arr[0];
				min = arr[1];
			}
			i = 2;
		}
		while(i < arr_size){
			if ( arr[i] < arr[i+1] ){
				if ( arr[i] < min )
					min = arr[i];
				if ( arr[i+1] > max )
					max = arr[i+1];
			}
			else
			{
				if ( arr[i] > max )
					max = arr[i];
				if ( arr[i+1] < min )
					min = arr[i+1];
			}
			i = i + 2;
		}
		return min + max;
    } 
}