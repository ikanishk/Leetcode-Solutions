class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 1000000000;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            int hour = 0;
            for(int p : piles){
                hour += (p - 1) / mid + 1;
            }
            if(hour > h)
                lo = mid + 1;
            else
                hi = mid;
        }
        return hi;
    }
}