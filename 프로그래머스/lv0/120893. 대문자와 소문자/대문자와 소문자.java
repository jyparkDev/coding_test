class Solution {
    public String solution(String my_string) {
        char[] ch  = my_string.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] <= 'Z') ch[i] += 32;
            else ch[i] -= 32;
        }
        return new String(ch);
    }
}