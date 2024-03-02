class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[26 * 2];
        char[] spell = my_string.toCharArray();
        
        for(char c : spell){
            if(c > 'Z'){
                answer[26 + (c - 'a')]++;
            }else{
                answer[(c - 'A')]++;
            }
        }
        
        return answer;
    }
}