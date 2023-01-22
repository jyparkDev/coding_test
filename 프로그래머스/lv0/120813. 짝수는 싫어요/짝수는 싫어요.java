import java.util.*;
class Solution {
    public int[] solution(int n) {
        int num = n % 2 == 0 ? n/2 : n / 2 + 1;
        int[] answer = new int[num]; 
        for(int i = 1,j = 0 ; i <= n ; i += 2)
            answer[j++] = i;
        return answer;
    }
}