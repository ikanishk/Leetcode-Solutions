class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int e : nums)
            if(e%2==0)
                map.put(e,map.getOrDefault(e,0)+1);
        
        int item = -1;
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val > max) {
                max = val;
                item = key;}
        }
        
        return item;
    }
}