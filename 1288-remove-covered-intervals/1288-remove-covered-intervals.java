class Solution {

public int removeCoveredIntervals(int[][] intervals) {
    int n = intervals.length;
    
    //The whole intutiton behind writng this comparator is to sort intervals array based on the first value of all intervals(if the first value is same, then on the second value).
    Arrays.sort(intervals, (a, b) -> {
        if (a[0] != b[0]) {
            return a[0] - b[0];    
        } else {
            return b[1] - a[1];
        }
    });
    
    
    int count = 0;
    int curr[] = intervals[0];
    for(int i=1; i<n; i++){
        if(intervals[i][1] <= curr[1]){
            count++;                    //count of covered intervals
        }
        
        curr[1] = Math.max(curr[1], intervals[i][1]);
    }
    
    return (n - count);
}
}

