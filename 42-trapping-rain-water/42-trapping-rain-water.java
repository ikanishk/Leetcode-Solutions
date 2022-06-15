class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<3){
            return 0;
        }
        
        //Create 2 Auxillary arrays for the "Prefix Max" and the "Suffix Max".
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        
        //Store the leftMax till 'i' in leftMax[i] and rightMax till 'i' in rightMax[i].
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
            rightMax[n-i-1] = Math.max(rightMax[n-i], height[n-i-1]);
        }
        
        //Iterate the array and apply the formula.
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            trappedWater += Math.min(leftMax[i], rightMax[i])-height[i];
        }
        
        return trappedWater;
    }
}