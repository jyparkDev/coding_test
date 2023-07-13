import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<Integer> boolList = new ArrayList<>();
        for(int i = 0; i< finished.length ; i++){
            if(!finished[i]) boolList.add(i);
        }
        
        String[] answer = new String[boolList.size()];
        for(int i = 0 ; i < answer.length ; i++ ){
            answer[i] = todo_list[boolList.get(i)];
        }
        return answer;
    }
}