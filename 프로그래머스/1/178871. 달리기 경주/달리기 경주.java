import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> idxMap = new HashMap<>();
        Map<Integer, String> nameMap = new HashMap<>();

        for (int i = 0 ; i < players.length; i++){
            nameMap.put(i,players[i]);
            idxMap.put(players[i],i);
        }

        for (String calling : callings) {
            int idx = idxMap.get(calling);
            int targetInx = idx - 1;
            String target = nameMap.get(targetInx);

            nameMap.put(idx,target);
            nameMap.put(targetInx,calling);
            idxMap.put(calling,targetInx);
            idxMap.put(target,idx);
        }

        String[] result = new String[nameMap.size()];

        for(int i = 0 ; i < result.length; i++){
            result[i] = nameMap.get(i);
        }

        return result;
    }
}