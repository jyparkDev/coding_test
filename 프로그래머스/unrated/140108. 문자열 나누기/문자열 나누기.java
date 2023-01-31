class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0,count2 = 0 ;
        char ch = s.charAt(0) ;
        for (int i = 0 ; i < s.length();i++){
            if(count == count2){
                answer++;
                ch = s.charAt(i);
            }
            if(ch == s.charAt(i)){
                count++;
            }else {
                count2++;
            }
        }
        return answer;
    }
}