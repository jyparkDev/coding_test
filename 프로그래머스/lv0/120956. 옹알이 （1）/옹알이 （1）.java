import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] caseStr = {"aya", "ye", "woo", "ma"};
        for(String str : babbling){
            for(String str2 : caseStr){
                str = str.replace(str2," ");
            }
            if(str.strip().length() == 0) answer++;
        }
        return answer;
    }
}