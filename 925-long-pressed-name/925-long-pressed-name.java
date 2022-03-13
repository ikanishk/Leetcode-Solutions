class Solution {
public boolean isLongPressedName(String name, String typed) {
int i = 0;
int j = 0;
char temp = ' ';

    outer:
    while (i<name.length() || j<typed.length()){
        // If typed has reached its end.
        if (j==typed.length()){
            break outer;
        }
        // name has reached its end but we still need to compare the characters of typed string.
        if(i==name.length()){
            if(typed.charAt(j)==temp){
                j++;
            }else{
                return false;
            }
        }
        // If both characters match increment position in both strings i.e. name and typed.
        else if(name.charAt(i)==typed.charAt(j)){
            temp = name.charAt(i);
            i++;
            j++;
        }
        // Checking if user long pressed a character.
        else if(typed.charAt(j)==temp){
            j++;
        }else{
            break outer;
        }
        
    }
    
    // If we reached end of name, means there was no mismatch in characters and considering long pressed is not a mismatch.
    if (i==name.length()){
        return true;
    }else{
        return false;
    }
}
}