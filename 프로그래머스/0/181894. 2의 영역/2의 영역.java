import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                if (list.size() == 2){
                    list.set(1,i);
                }else{
                    list.add(i);
                }
            }
        }

        if (list.size() == 0){
            return new int[]{-1};
        } else if (list.size() == 1) {
            return new int[]{arr[list.get(0)]};
        }else{
            return Arrays.copyOfRange(arr,list.get(0),list.get(1)+1);
        }
    }
}