// import java.util.*;

// class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.split(" ");
//         String ans = "";
        
//         for (int i = words.length-1; i >= 0; i--) {
//             if (words[i].trim().length() == 0) {
//                 // Skip over
//             }
//             else {
//                 ans += words[i] + " ";
//             }
//         }
        
//         ans = ans.trim();
//         return ans;
//     }
// }

class Solution{
public String reverseWords(String s) {
	int i=s.length()-1;
	StringBuilder sb = new StringBuilder();
	
	while(i>=0){       //Start Traversing from the back
	
		while(i>=0&&s.charAt(i)==' '){    //Skip the spaces
			i--;
		}

		int j = i;       //Index at which first non space character comes(end index of a word)

		while(i>=0 && s.charAt(i)!=' '){    //find the index till where that word is(start index of a word)
			i--;
		}
		if(j!=i)   //this check is necessary to skip the spaces at the starting of string
			sb.append(s.substring(i+1,j+1) + " ");    //append the word from start to end index in your answer string with a space after each word

        }
	sb.setLength((sb.length()-1));  //removing the extra space of the last word appended

	return sb.toString();
}

}