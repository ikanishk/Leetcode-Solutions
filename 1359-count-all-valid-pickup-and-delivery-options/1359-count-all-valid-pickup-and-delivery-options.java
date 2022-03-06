class Solution {
   public int countOrders(int n) {
	long result = 1;
	int m = 1000000007;
	for (int i = 1; i <= n; i++) {
		result *= i * (2L * i - 1); //doing both factorial and odd numbers in one go, still within long data type range
		result %= m;
	}
	return (int) result;
}
}