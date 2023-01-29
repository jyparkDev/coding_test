import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        if(arr.length == 1) return arr;
        Queue<Integer> q = new LinkedList<>();
        int[] tmp = new int[arr.length];
        int cp = tmp[0] = arr[0];
        int count = 1;
        for(int i = 1 ; i < arr.length ; i++)
            if(cp != arr[i])
                tmp[count++] = cp = arr[i];
        arr = Arrays.copyOf(tmp,count);
        return arr;
    }
}