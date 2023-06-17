class Solution {
    public int[] solution(String s) {
        int[] posit = new int[26];
        int[] answer = new int[s.length()];
        for(int i = 1 ; i <= s.length(); i++){
            char c = s.charAt(i - 1);
            if(posit[c - 'a'] == 0) answer[i - 1] = -1;
            else answer[i - 1] = i - posit[c - 'a'];
            posit[c - 'a'] = i;
        }

        return answer;
    }
}