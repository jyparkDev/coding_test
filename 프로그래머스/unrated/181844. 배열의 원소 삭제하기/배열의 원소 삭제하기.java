import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            boolean check = true;
            for(int j = 0 ; j < delete_list.length ; j++){
                if(delete_list[j] == num){
                    check = false;
                    break;
                }
            }
            if(check){
                list.add(num);
            }
            
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}