class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // binary search between [0, highestTime * totalTrips]
        long high = 0;
        for(int t:time){
            high = Math.max(high, t);
        }
        high *= totalTrips;
        
        long res = Long.MAX_VALUE;
        long low = 0;
        while(high >= low){
            long t = totalTrips;
            long mid = low + (high - low)/2;
            for(int i = 0; i < time.length; i++){
                t -= (mid / time[i]);
            }
            if(t > 0){
                low = mid + 1;
            }else{
                high = mid - 1;
                res = Math.min(mid, res);
            }
        }
        
        return res;
    }
}