import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] std = new int[arr.length];


        int count = 0;
        do{
            System.arraycopy(arr,0,std,0, arr.length);
            ++count;
            arr = Arrays.stream(arr).map( x -> {
                if (x >= 50 && x % 2 == 0){
                    return x / 2;
                }else if( x < 50 && x % 2 == 1){
                    return x * 2 + 1;
                }
                return x;
            }).toArray();
        }while (!Arrays.equals(arr,std));
        return count - 1;
    }
}