import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l ; i<= r ; i++) {
            if(String.valueOf(i).replaceAll("[5,0]","").length() == 0){
                list.add(i);
            }
        }
        if (list.size() == 0){
            return new int[]{-1};
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}