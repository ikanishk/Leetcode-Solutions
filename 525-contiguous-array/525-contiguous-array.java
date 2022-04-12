class Solution {
 public int findMaxLength(int[] nums) {
        //replace 0 with -1
        
        for(int i=0; i < nums.length;i++) {
            if(nums[i] == 0) {
                nums[i] = -1;
            }
        }
        
        //apply largest subarray having sum = 0
        HashMap<Integer,Integer>map = new HashMap<>(); //ps vs fi
        map.put(0,-1);
        int ps = 0;
        int olen = 0;
        
        for(int i=0; i < nums.length;i++) {
            ps += nums[i];
            
            if(map.containsKey(ps) == true) {
                int len = i - map.get(ps);
                olen =  Math.max(olen,len);
            }
            else {
                map.put(ps,i);
            }
        }
        
        return olen;
    }
}