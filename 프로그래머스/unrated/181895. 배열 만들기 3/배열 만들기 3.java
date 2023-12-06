import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j = a ; j <= b ; j++){
                list.add(arr[j]);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}