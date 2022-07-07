class Solution {
    public int[] frequencySort(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
        }
         Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < list.size(); i++) {
      map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
    }

    Collections.sort(list, (n1, n2) -> {
      int freq1 = map.get(n1);
      int freq2 = map.get(n2);

      if (freq1 != freq2) {
        return freq2 - freq1;
      }

      return n1 - n2;
    });
    int[] n = list.stream().mapToInt(i -> i).toArray();

    return reverse(n,n.length);   
    }
    
    public static int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
    }
     return b;   
    }
}