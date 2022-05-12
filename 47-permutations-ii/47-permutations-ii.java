class Solution {
    List<List<Integer>> res;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new LinkedList<>();
        get(nums, 0);
        return res;
    }
    
    private void get(int[] nums, int start) {
        if (start == nums.length - 1) {
            res.add(toList(nums));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (set.add(nums[i])) {
                int tmp = nums[start];
                nums[start] = nums[i];
                nums[i] = tmp;
                get(nums, start + 1);
                nums[i] = nums[start];
                nums[start] = tmp;
            }
        }
    }
    
    private List<Integer> toList(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i : nums) list.add(i);
        return list;
    }
}