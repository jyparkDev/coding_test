import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String answer = "";
        String ss = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
        for (char c : ss.toCharArray()){
            int num = 0;
            for(int i = 0 ; i < s.length()  ;i++){
                if (s.charAt(i) == c) {
                    num++;
                    if (num > 1) break;
                }
            }
            if(num == 1) answer += ""+c;
        }
        return Arrays.stream(answer.split("")).sorted().collect(Collectors.joining());
    }
}