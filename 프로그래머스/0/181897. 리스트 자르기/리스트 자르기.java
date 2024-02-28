import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = n == 1 ? 0 : slicer[0];
        int b = n == 2 ? num_list.length - 1 : slicer[1];
        int c = n == 4 ? slicer[2] : 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = a ; i <= b ; i += c){
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}