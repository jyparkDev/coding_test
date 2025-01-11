import java.util.*;

class Solution {
    public String[] solution(String myStr) {

        String[] strArr = myStr.split("[a|b|c]");

        String[] resultArr = Arrays.stream(strArr).filter(s -> !s.equals("")).toArray(String[]::new);
        
        return resultArr.length != 0 ? resultArr : new String[]{"EMPTY"} ;
    }
}