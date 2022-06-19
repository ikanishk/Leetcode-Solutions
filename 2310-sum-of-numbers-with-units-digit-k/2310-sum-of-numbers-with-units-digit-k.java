class Solution {
int minimumNumbers(int num, int k) {
        
        if(num==0)return 0;
        
    //Find the unit digit of the number.
        int un=num%10;
    
    //if num is less than k, then it cannot add up, so return -1.
        if(num<k){
            return -1;
        }
        
    //we multiply k with values of 'i' from 1 -> 10 and check if the unit digits of (k*i) matches num.
        for(int i=1;i<=10;i++){
            int res=(k*i)%10;
            if(res==un){
                if(k*i>num){
                    return -1;
                }
                return i;
            }
        }
            
        return -1;
    }
}