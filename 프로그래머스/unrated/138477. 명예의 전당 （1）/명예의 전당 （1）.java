import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution{
   public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        int tmp = k;
        for(int i = 0 ; i < score.length ; i++){
            list.add(score[i]);
            list = list.stream().sorted((s1,s2)-> Integer.compare(s2,s1)).collect(Collectors.toList());
            if(i < k){
                answer[i] = list.get(i);
            }else{
                answer[i] = list.get(k-1);
            }
        }
        return answer;
    }
}