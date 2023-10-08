import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        q1.addAll(List.of(cards1));
        q2.addAll(List.of(cards2));

        for (String targer : goal) {
            if(!q1.isEmpty() && q1.peek().equals(targer) ){
                q1.poll(); continue;
            }
            if(!q2.isEmpty() && q2.peek().equals(targer)){
                q2.poll(); continue;
            }
            return "No";
        }
        return "Yes";
    }
}