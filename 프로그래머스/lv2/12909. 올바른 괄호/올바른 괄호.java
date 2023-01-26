import java.util.*;
class Solution {
    boolean solution(String s) {
        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()){
            if(c == ')'){
                if(queue.isEmpty()) return false;
                queue.poll();
            }else{
                queue.add(c);
            }
        }
        return queue.size() > 0 ? false : true;
    }
}