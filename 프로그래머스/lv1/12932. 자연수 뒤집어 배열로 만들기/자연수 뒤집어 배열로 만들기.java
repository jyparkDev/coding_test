class Solution {
    public int[] solution(long n) {
        char[] ch = String.valueOf(n).toCharArray();
        int[] answer = new int[ch.length];
        for(int i = ch.length-1,k=0 ; i >=0;i--)
            answer[k++] = ch[i] - '0';
        return answer;
    }
}