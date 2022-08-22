class Solution {
  public int minDays(int[] A, int m, int k) {
        // binary search answer
        int l = Integer.MAX_VALUE, r = 0;
        int n = A.length;
        if (n < m * k) return -1;
        for (int i = 0; i < A.length; i++) {
            l = Math.min(l, A[i]);
            r = Math.max(r, A[i]);
        }
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (helper(A, m, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    
    private boolean helper(int[] A, int m, int k, int t) {
        int n = A.length;
        for (int i = 0; i <= n - k; i++) {
            if (A[i] > t) continue;
            int c = i;
            while (c < i + k) {
                if (A[c] > t) break;
                c++;
            }
            if (c == i + k) m--;
            i = c - 1;
        }
        return m <= 0;
    }
}