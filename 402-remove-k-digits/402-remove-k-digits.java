class Solution {
    public String removeKdigits(String num, int k) {
    	char[] arr = num.toCharArray();
        int n = arr.length, pos = -1, start = 0, len = n - k;
        if (n <= k)
        	return "0";
        // Iterate for each digit
		for (int i = 0; i < n; i++) {
			// keep the ascending order on the left
			// pos is the last index of ascending sub-array
        	for (; pos >= 0 && k > 0 && arr[i] < arr[pos]; pos--, k--);
        	// add the current digit arr[i] to the correct place to keep the ascending order
			arr[++pos] = arr[i];
        }
		// remove the leading '0'; to avoid the empty string, don't check the last one (len - 1)
        while (start < len - 1 && arr[start] == '0')
        	start++;
        return String.valueOf(arr, start, len - start);
    }
}