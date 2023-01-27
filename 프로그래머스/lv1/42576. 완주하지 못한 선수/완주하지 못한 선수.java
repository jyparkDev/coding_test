import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> nameMap = new HashMap<>();
        for(String s : participant) {
            nameMap.put(s,nameMap.getOrDefault(s, 0) + 1);
        }
        for(String s : completion) {
            nameMap.put(s,nameMap.get(s)-1);
        }

        Iterator iter = nameMap.keySet().iterator();
        while (iter.hasNext()){
            String s = (String)iter.next();
            if(nameMap.get(s) > 0)
                return s;
        }
        return "";
    }     
}