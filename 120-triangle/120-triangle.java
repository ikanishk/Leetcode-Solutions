class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //Top Down Approach
        //We traverse through the triangle and
        //for the first and last element in every row of the triangle, copy the direct result from above and for the remaining  element ge the the minimium of  arr[i-1][j] or arr[i-1][j-1]
        for(int i = 1; i < triangle.size(); i++) {
            for(int j = 0; j < triangle.get(i).size(); j++){
                int sum = 0; 
                if(j == 0) {
                    sum = triangle.get(i).get(j) + triangle.get(i-1).get(j);
                }
                else if(j == triangle.get(i).size()-1) {
                    sum = triangle.get(i).get(j) + triangle.get(i-1).get(triangle.get(i-1).size()-1);
                }
                else {
                    int min = Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
                    sum = min+ triangle.get(i).get(j);
                }
                
                triangle.get(i).set(j, sum);
            }
        }
        return Collections.min(triangle.get(triangle.size()-1));
    }
}