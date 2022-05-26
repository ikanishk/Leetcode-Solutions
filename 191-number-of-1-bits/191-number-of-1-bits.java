public class Solution {
public int hammingWeight(int n) {
    int ans=0;
    //This function returns the string representation of the unsigned Integer value represented by the argument in binary (base 2).
    //Input : 10 
    // Output : 1010 

     // Input : 9
     // Output : 1001 
    String temp = Integer.toBinaryString(n);
    int len=temp.length();
    for(int i=0;i<len;++i){
        if(temp.charAt(i)=='1'){
             ans++;
        }
    }
    return ans;
}
}