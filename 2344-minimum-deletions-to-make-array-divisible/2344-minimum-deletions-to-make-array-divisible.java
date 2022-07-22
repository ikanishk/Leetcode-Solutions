class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd=0,count=0;
        for(int a:numsDivide){
            gcd = findGCD(gcd,a);
        }
        Arrays.sort(nums);
        for(int a:nums){
            if(gcd%a==0) return count;
            count++;
        }
        return -1;
    }
    int findGCD(int a,int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
}