import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        char[] ch = myString.toCharArray();
        for(char c : ch){
            if(c == 'x'){
                list.add(count);
                count = 0;
            } else{
                count++;
            }
        }

        list.add(count);
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}