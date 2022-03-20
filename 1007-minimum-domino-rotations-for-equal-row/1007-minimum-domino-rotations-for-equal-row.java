class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int arr[] = new int[6];
        for(int i: tops){
            arr[i-1]++;
        }
        int max = 0;
        int maxe = 0;
        for(int i=0;i < 6;i++){  // if the solution exist, it will contain the element with max occurence only
            if(arr[i]>max){
                max = arr[i];
                maxe = i+1;
            }
        }
        int c = 0;
        boolean tc = true;
        for(int i =0; i<tops.length; i++){   // check if you can swap top values with bottoms and maintain a count
            if(tops[i] == maxe) continue;
            else{
                if(bottoms[i] == maxe) {
                    c++;
                }
                
                else {
                    tc = false;
                    break;
                }
            }
        }
        
        // same steps for checking if the solution exist for swapping bottom values with top
        
        int brr[] = new int[6];
        for(int i: bottoms){
            brr[i-1]++;
        }
        int maxb = 0;
        int maxbe = 0;
        for(int i=0;i < 6;i++){
            if(brr[i]>maxb){
                maxb = brr[i];
                maxbe = i+1;
            }
        }
        int c1 = 0;
        boolean bc = true;
        for(int i =0; i<tops.length; i++){
            if(bottoms[i] == maxbe) continue;
            else{
                if(tops[i] == maxbe) c1++;
                else {
                    bc = false;
                    break;
                }
            }
        }
        
        //if answer exists for both the cases, return the minimum swaps
        
        if(bc && tc) return Math.min(c, c1);
        else if(bc) return c1;
        else if(tc) return c;
        return -1;
        
    }
}