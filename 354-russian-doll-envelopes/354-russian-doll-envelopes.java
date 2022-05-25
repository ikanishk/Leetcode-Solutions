class Solution {
int dp[];
public int BS(int start,int end,int target){
    if(start<=end){
        int mid = (start+end)/2;
        if(dp[mid]==target){
            return mid;
        }
        if(dp[mid]>target){
            return BS(start,mid-1,target);
        }
        else{
            return BS(mid+1,end,target);
        }
    }
    return start;
}
public int maxEnvelopes(int[][] envelopes) {
    dp = new int[envelopes.length];
    Arrays.sort(envelopes,(a,b)->{
        return a[0]==b[0] ? b[1]-a[1] : a[0]-b[0];
    });
    int j=0;
    dp[0]=envelopes[0][1];
    for(int i=1;i<envelopes.length;i++){
        if(dp[j]<envelopes[i][1]){
            dp[++j]=envelopes[i][1];
        }
        else{
            int index = BS(0,j,envelopes[i][1]);
            dp[index]=envelopes[i][1];
        }
    }
    return j+1;
}
}