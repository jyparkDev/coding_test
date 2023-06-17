class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        for(int i = my_string.length() - 1 ; n > 0 ; n--, i--)
            sb.append(ch[i]);
        return sb.reverse().toString();
    }
}