import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for(int i = answer.length-1,j=0 ; i >= 0 ;i--,j++)
            answer[j] = str.charAt(i) - '0';
        return answer;

    }
}