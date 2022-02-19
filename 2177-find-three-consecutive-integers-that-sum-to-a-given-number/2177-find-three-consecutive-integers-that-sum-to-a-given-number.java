// The answers [a, b, c] can be viewed in the following way.
// a + b + c = x
// b = a + 1
// c = a + 2
// so.
// a + (a + 1) + (a + 2) = x
// 3a + 3 = x
// 3a = x - 3
// a = x/3 - 1

// x is an integer, it is not an answer unless it is divisible by 3.
class Solution {
        public long[] sumOfThree(long num) {
        if (num % 3 != 0) {
            return new long[0];
        }
        num /= 3;
        return new long[]{num - 1, num, num + 1};
    }
}