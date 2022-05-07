class Solution {
    public boolean find132pattern(int[] nums) {
        // make a stack monotonically decreasing stack 
        // which contains the current largest and smallest value
        Stack<int[]> st = new Stack<>();
        int min = nums[0];
        st.push(new int[]{nums[0], min});
        
        for(int i = 1; i < nums.length; i++) {
            while(st.size() > 0 && st.peek()[0] <= nums[i]) {
                st.pop();
            }
            if(st.size() > 0 && st.peek()[1] < nums[i]) {
                return true;
            }
            st.push(new int[]{nums[i], min});
            min = Math.min(min, nums[i]);
        }
        return false;
    }
}