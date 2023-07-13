import java.util.Arrays;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int result = equalsInt(arr1.length, arr2.length) ;
        if(result == 0){
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            result = equalsInt(sum1, sum2) ;
        }

        return result;
    }
    public static int equalsInt(int x, int y){
        if(x > y){
            return 1;
        }
        if(x < y){
            return -1;
        }
        return 0;
    }
}