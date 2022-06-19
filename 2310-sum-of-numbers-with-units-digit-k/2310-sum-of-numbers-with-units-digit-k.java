class Solution {
int minimumNumbers(int num, int k) {
        
        if(num==0)return 0;
        
        int un=num%10;
        if(num<k){
            return -1;
        }
        
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