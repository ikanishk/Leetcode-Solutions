class Solution {
    //Kadane's algorithm
    public int maxSubArray(int[] arr) {
      int csum=arr[0];
      int bsum=arr[0];
        
    for(int i=1;i<arr.length;i++){
    if(csum>0){
    csum+=arr[i];
    }
    else{
    csum=arr[i];
    }
    
    if(csum>bsum){
        bsum=csum;
    }
    }
    return bsum;
    }
}