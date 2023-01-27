import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0,j = arr.length-1 ; i <= j ; i++,j--){
            if(arr[i]%divisor == 0 ) list.add(arr[i]);
            if(arr[j]%divisor == 0) list.add(arr[j]);
        }
        if(list.size()==0) list.add(-1);
        return list.stream().distinct().sorted().mapToInt(x->x).toArray();
    }
}