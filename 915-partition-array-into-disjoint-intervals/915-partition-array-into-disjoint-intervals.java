class Solution {
    public int partitionDisjoint(int[] arr) {
    int[]lmax=new int[arr.length+1];
    int[]rmin=new int[arr.length+1];
    int ans=0;
    rmin[rmin.length-1]=Integer.MAX_VALUE;
        
    for(int i=rmin.length-2;i>=0;i--){
    rmin[i]=Math.min(rmin[i+1],arr[i]);
    }
    
    int lmaxval=Integer.MIN_VALUE;

    for(int i=0;i<lmax.length-1;i++){
      lmaxval=Math.max(lmaxval,arr[i]);
      if(lmaxval<=rmin[i+1]){
          ans= i+1;
          break;
      }
    }
    
    return ans;
    }
}