import java.util.Arrays; 

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);

        arr = Arrays.stream(arr).distinct().toArray();

        int end = arr.length > k ? k : arr.length;

        for (int i = 0 ; i < end ; i++){
            result[i] = arr[i];
        }

        return result;
    }
}