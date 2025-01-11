import java.util.*;
class Solution {
    public String[] solution(String myString) {

        String[] xes = myString.split("x");

        return Arrays.stream(xes).filter(x -> !x.equals("")).sorted().toArray(String[]::new);
    }
}