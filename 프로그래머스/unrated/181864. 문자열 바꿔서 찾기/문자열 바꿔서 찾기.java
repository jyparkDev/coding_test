class Solution {
    public int solution(String myString, String pat) {
        char[] ch = myString.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == 'A'){
                ch[i] = 'B';
            }else{
                ch[i] = 'A';
            }
        }
        
        return new String(ch).contains(pat) ? 1 : 0;
    }
}