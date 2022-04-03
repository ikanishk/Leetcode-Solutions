class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0;
        
        for(int val : arr) {
            sum += val;
        }
        
        int rsum = sum;
        int lsum = 0;
        
        for(int i = 0; i < arr.length;i++) {
            rsum -= arr[i];
            
            if(lsum == rsum) {
                return i;
            }
            
            lsum += arr[i];
        }
        
        return -1;
    }
}