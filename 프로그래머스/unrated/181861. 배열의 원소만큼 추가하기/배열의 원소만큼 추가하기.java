import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr){
            for(int i = 0 ; i < n ; i++){
                list.add(n);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}