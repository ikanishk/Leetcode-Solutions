class Solution {
    public int maxProduct(String[] words) {
        int[][] hash = new int[words.length][26];
        for(int i=0; i<words.length; i++)
            for(char c: words[i].toCharArray())
                hash[i][c-'a']++;
        int product = 0;
        for(int i=0; i<words.length; i++)
            for(int j=i+1; j<words.length; j++)
                if(unique(hash,i,j))
                    product = Math.max(product, words[i].length()*words[j].length());
        return product;
    }
    
    public boolean unique(int[][] hash, int i, int j){
        for(int k=0; k<26; k++)
            if(hash[i][k]>0 && hash[j][k]>0)
                return false;
        return true;
    }
}