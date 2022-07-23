class Solution {
	public long zeroFilledSubarray(int[] arr) {
		long count = 0;
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			} else {
				sum += (count * (count + 1) / 2);
				count = 0;
			}
		}
		if (arr[arr.length - 1] == 0) {
			sum += (count * (count + 1) / 2);
		}
		return sum;
	}
}