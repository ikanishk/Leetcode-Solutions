//The Approach is that we start searching from the last element of the first row and if the element is less than target, we increase the row(as above that row are all smaller numbers) and if we find a greater number then we decrease the column./
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        
        int i=0,j=matrix[0].length-1;
        
        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] < target) {
                i++;
            }
            else if(matrix[i][j] > target) {
                j--;
            }
            else {
                return true;
            }
        }
        
        return false;
    }
}