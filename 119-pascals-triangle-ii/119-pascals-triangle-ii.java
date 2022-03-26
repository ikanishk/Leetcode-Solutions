class Solution {
    public List<Integer> getRow(int i) {
        ArrayList<Integer>ans=new ArrayList<>();
        long val=1;
        for(int j=0;j<=i;j++){
        ans.add((int)val);
        val = (val * (i - j)) / (j + 1);
        }
        return ans;
    }
}


// class Solution {
//    public List<Integer> getRow(int rowIndex) {
//         List<Integer> ans = new ArrayList<>();                
//         long val=1;
		
//         for(int j = 0; j <= rowIndex; j++){
//                 ans.add((int)val );
//                 val = (val * (rowIndex - j)) / (j + 1);
//             }
			
//         return ans;
//     }
// }