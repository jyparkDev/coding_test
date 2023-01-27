import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer= 0;
        for(int i = 0, cMoney = 0 ; i < d.length ; i++){
            cMoney += d[i];
            if(cMoney > budget) return answer;
            answer++;
        }
        return answer;
    }
}