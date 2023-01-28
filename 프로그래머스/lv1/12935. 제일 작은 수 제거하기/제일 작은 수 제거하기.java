import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
         if(arr.length == 1){
         return new int[]{-1};
         }
         int[] answer = arr.clone();
         Arrays.sort(arr);
         int min = arr[0];
         arr = new int[answer.length-1];
         for(int i = 0 ; i < answer.length;i++){
        if(answer[i] == min){
        for(int j = i+1; j < answer.length; j++){
        arr[j-1] = answer[j];
        }
        return arr;
        }
        else arr[i] = answer[i];
        }
        return arr;
    }
}