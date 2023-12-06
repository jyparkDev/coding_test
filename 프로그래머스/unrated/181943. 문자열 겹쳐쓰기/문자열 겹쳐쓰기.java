class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuffer sb = new StringBuffer();
        sb.append(my_string.substring(0,s));
        sb.append(overwrite_string);
        s += overwrite_string.length();
        if(my_string.length() - 1 >= s){
            sb.append(my_string.substring(s));
        }

        return sb.toString();
    }
}