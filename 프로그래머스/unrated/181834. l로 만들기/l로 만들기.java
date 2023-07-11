class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        char ch = 'l';
        for(int i = 0 ; i < myString.length() ; i++){
            char tmp = myString.charAt(i);
            if(tmp < ch){
                sb.append(ch);
            }else{
                sb.append(tmp);
            }
        }
        return sb.toString();
    }
}