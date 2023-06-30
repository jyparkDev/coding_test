import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0 ; i < query.length ; i++){
            int target = query[i];
            if(i % 2 == 0){
                arr = backsplit(target, arr);
            } else{
                arr = frontsplit(target,arr);
            }
        }
        return arr;
    }

    private int[] backsplit(int target, int[] arr) {
        return Arrays.copyOfRange(arr, 0, target + 1);
    }

    private int[] frontsplit(int target, int[] arr) {
        return Arrays.copyOfRange(arr, target, arr.length);
    }
}