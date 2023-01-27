class Solution {
    public String solution(String s, int n) {
        char[] ch = s.toCharArray();
        for(int i = 0,tmp = 0 ; i < ch.length ; i++){
            if(ch[i] == ' ') continue;
            char UpperLower = ch[i] > 'Z' ? 'a' : 'A';
            ch[i] = (char)(UpperLower + ((ch[i] + n -UpperLower)%26));
        }
        return new String(ch);
    }
}