
import java.util.*;
class Solution {
    Map<String,List<String>> blacklist ;
    Map<String,Integer> count ;

    public void init(String[] id_list){
        blacklist = new HashMap<>();
        count = new HashMap<>();
        for (String id : id_list){
            blacklist.put(id,new ArrayList<>());
            count.put(id,0);
        }
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        init(id_list);
        int[] result = new int[id_list.length];
        for (String s : report) {
            // 신고자, 신고된 자 분리
            String[] list = s.split(" ");
            if (!blacklist.get(list[0]).contains(list[1])) {
                blacklist.get(list[0]).add(list[1]);
                count.put(list[1], count.get(list[1]) + 1);
            }
        }

        for (int i = 0 ; i < id_list.length ; i++){
            String id = id_list[i];
            result[i] = (int)blacklist.get(id).stream().filter( b -> count.get(b) >= k).count();
        }
        return result;
    }
}