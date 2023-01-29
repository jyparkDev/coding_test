import java.util.*;

class Solution {
    public String solution(String s) {
         String[] strArr = s.split(" ");
        int[] result =Arrays.stream(strArr).mapToInt( x  -> Integer.parseInt(x)).sorted().toArray();
        String answer = result[0] + " " + result[result.length-1];
        return answer;
    }
}