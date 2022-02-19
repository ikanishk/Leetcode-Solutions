
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> vals = new ArrayList<Long>();
        long n = finalSum;
		// If Odd number return blank list;
        if(finalSum%2!=0){
            return vals;
        }
        for(long i=2;i<=n;i++){
		//While adding even numbers if the required number has already crossed it's boundary
            if(finalSum<i){
                finalSum+=vals.get(vals.size()-1);
                vals.remove(vals.size()-1);
            }
			//If Even add to list & subtract it from our required sum
            if(i%2==0){
                vals.add(i);
                finalSum-=i;
            }            
            if(finalSum == 0){
                return vals;
            }
        }
         return vals;
    }
}