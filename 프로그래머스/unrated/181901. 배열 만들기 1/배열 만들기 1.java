import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = k ; i <= n ; i+=k){
            list.add(i);
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}