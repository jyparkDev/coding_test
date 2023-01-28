import java.util.*;

class Solution {
    public String solution(String s) {
        String str[] = s.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str,Comparator.reverseOrder());
        for(String st : str){
            sb.append(st);
        }
        return sb.toString();

    }
}