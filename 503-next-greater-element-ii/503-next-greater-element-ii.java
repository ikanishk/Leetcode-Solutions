//Approach: 
//STEP 1: Run a loop from right -> left implementing the NGE algorithm but don't make a answer array.
//STEP 2: Run the same loop again from right -> left but this time make an answer array.
class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[]ans = new int[n];
        Stack<Integer>st = new Stack<>();
        
        for(int i=n-1; i >= 0;i--) {
            while(st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            st.push(arr[i]);
        }
        
        for(int i=n-1; i >= 0;i--) {
            while(st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            
            if(st.size() == 0) {
                ans[i] = -1;
            }
            else {
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return ans;
    }
}