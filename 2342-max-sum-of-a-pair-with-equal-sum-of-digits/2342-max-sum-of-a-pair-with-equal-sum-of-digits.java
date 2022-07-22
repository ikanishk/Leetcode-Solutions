class Solution {
    public int maximumSum(int[] nums) {
     Map<Integer,Integer>map=new HashMap<>();
    int max=-1;
        for(int i=0;i<nums.length;i++){
          int sum=getsum(nums[i]);
            if(map.containsKey(sum)){
                max=Math.max(max,nums[i]+map.get(sum));
                if(map.get(sum)<nums[i])map.put(sum,nums[i]);
            }
            else{
                map.put(sum,nums[i]);
            }
        }
        return max;   
    }
    int getsum(int n){
        int sum = 0;
        while (n != 0){
            sum=sum+n%10;
            n = n/10;
        }
       return sum;
    }
}