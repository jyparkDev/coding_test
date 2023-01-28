import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList();
        int num = arr[0];
        q.add(num);
        for(int i = 1 ; i < arr.length; i++){
            if(num != arr[i]){
                num = arr[i];
                q.add(num);
            }
        }
        int[] answer = new int[q.size()];
        for(int i = 0 ; i < answer.length ;i++)
            answer[i] = q.poll();
        return answer;
    }
}