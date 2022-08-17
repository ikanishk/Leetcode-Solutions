class Solution {
public List<String> restoreIpAddresses(String s) {
    List<String> r = new LinkedList<>();
    fn(s, 0, 4, new StringBuilder(), r);
    return r;
}

void fn(String s, int pos, int step, StringBuilder sb, List<String> r) {
    // 255.255.11.135
    if(step<0) return;

    if(pos==s.length() && step==0) {
        r.add(sb.toString().substring(0, sb.length()-1));
        return;
    }

    for (int i = pos; i <= pos+2 && i<s.length(); i++) {
        String number = s.substring(pos, i + 1);
        if (!isValidNumber(number)) continue;

        sb.append(number).append(".");
        fn(s, i+1, step-1, sb, r);
        sb.setLength(sb.length() - (i+1-pos+1) );
    }
}

boolean isValidNumber(String number) {
    if((number.length()>1 && number.startsWith("0")) || Integer.parseInt(number)>255) return false;
    return true;
}
}