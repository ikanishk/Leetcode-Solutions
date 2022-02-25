class Solution {
 public boolean isUgly(int n) {
        if(n == 0) return false;
        while(n % 2 == 0) n /= 2; // divide untill divisible by 2
        while(n % 3 == 0) n /= 3; // divide untill divisible by 3
        while(n % 5 == 0) n /= 5; // divide untill divisible by 5
        return n == 1;  // if number is ugly then definately n has become 1 after divided by 2, 3, and 5
    }
}