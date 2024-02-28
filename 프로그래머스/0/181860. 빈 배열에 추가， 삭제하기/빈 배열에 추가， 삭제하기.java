import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] result = new int[100000];
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int target = arr[i];
            if (flag[i]){
                for(int j = 0 ; j < arr[i] * 2; j++){
                    result[idx + j] = target;
                }
                idx += target * 2;
            }else{
                idx -= target;
            }
        }
        return Arrays.copyOf(result,idx);
    }
}