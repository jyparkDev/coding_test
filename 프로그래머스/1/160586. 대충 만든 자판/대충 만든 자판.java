import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String k : keymap){
            char[] c = k.toCharArray();
            for(int i = 0 ; i < c.length ; i++){
                String target = c[i] + "";
                if( map.get(target) != null && map.get(target) >= i + 1){
                    map.put(target , i + 1);
                    continue;
                }
                map.put(target, map.getOrDefault(target, i + 1));
            }
        }
        
        for(int i = 0 ; i < targets.length ; i++){
            char[] c = targets[i].toCharArray();
            int num = 0;
            for(char ch : c){
                String str = ch + "";
                if( map.get(str) == null ){
                    answer[i] = -1;
                    break;
                }
                num += map.get(str);
            }
            answer[i] = answer[i] == -1 ? -1 : num;
        }

        
        return answer;
    }
}