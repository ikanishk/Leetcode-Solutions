class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        for(int i = 0 ; i < nums.length; i ++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],j++);
            }
        }
        for(int i = 0 ; i < nums.length; i ++){
            nums[i] = map.get(arr[i]);
        }
        return nums;
    }
}