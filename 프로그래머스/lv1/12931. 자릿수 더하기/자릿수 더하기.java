import java.util.*;

public class Solution {
    public int solution(int n) {
        char[] ch = String.valueOf(n).toCharArray();
        int answer = 0;
        for(int i = 0 ; i <  ch.length ; i++)
            answer  += ch[i] - '0';
        return answer;
    }
}