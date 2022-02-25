class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");

        int len1 = str1.length;
        int len2 = str2.length;
		// Basic logic is to check each character one by one. If they are same we continue checking, or else,
		//we simply return the result depending on which number is greater.
        // This is the case if length of both versions match.
        if(len1 == len2){
            int i = 0;
            while(i<len1){
            if(Integer.valueOf(str1[i]) > Integer.valueOf(str2[i])){
                    return 1;
                }
                else if(Integer.valueOf(str1[i]) < Integer.valueOf(str2[i])){
                    return -1;
                }
                else{
                    i++;
                }
            }
        }
		
		//If length of version 1 is more.
        if(len1>len2){
            int i = 0;
            while(i<len2){
            if(Integer.valueOf(str1[i]) > Integer.valueOf(str2[i])){
                    return 1;
                }
                else if(Integer.valueOf(str1[i]) < Integer.valueOf(str2[i])){
                    return -1;
                }
                else{
                    i++;
                }
            }
            while(i<len1){
                if(Integer.valueOf(str1[i]) > 0){
                    return 1;
                }
                i++;
            }
        }
        //If length of version 2 is more.
        if(len1<len2){
            int i = 0;
            while(i<len1){
            if(Integer.valueOf(str1[i]) > Integer.valueOf(str2[i])){
                    return 1;
                }
                else if(Integer.valueOf(str1[i]) < Integer.valueOf(str2[i])){
                    return -1;
                }
                else{
                    i++;
                }
            }
            while(i<len2){
                if(Integer.valueOf(str2[i]) > 0){
                    return -1;
                }
                i++;
            }
        }
        return 0;
    }
}