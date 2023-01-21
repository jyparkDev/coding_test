class Solution {
    public int[] solution(long n) {
        String sb = new StringBuilder(String.valueOf(n)).reverse().toString();
        int[] answer = new int[sb.length()];
        for(int i = 0 ; i < answer.length ;i++){
            answer[i] = sb.charAt(i) - '0';
        }
        return answer;
    }
}