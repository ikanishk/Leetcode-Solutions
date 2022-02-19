class Solution {
    public int minimumDeviation(int[] nums) {
        /** reducing to one operation i.e divide
         *  so converting odd elements to even
        **/
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] *= 2;
            }
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int n: nums) {
            set.add(n);
        }
        int mn = Integer.MAX_VALUE;
        while(true) {
            int smallest = set.first(), largest = set.pollLast();
            mn = Math.min(largest - smallest, mn);
            if (largest % 2 != 0) {
                break;
            }
            set.add(largest / 2);
        }
        return mn;
    }
}