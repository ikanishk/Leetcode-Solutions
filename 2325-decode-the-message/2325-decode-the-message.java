class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> mapping = new HashMap<>();
        int index = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c == ' ' || mapping.containsKey(c)) {
                continue;
            }
            if (index >= 26) {
                break;
            }        
            char letterInAlphabet = (char) (index + 'a');
            mapping.put(c, letterInAlphabet);
            index++;
        }
        mapping.put(' ', ' ');
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            result = result + mapping.get(message.charAt(i));
        }
        return result;
    }
}