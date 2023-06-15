
import java.util.*;
class Solution {
    Map<String,Integer> map = new HashMap<>();

    public void init(){
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);
    }

    public void scoring(String survey,int choice){
        if(choice < 4){
            map.put(survey.substring(0,1), map.get(survey.substring(0,1)) + 4 - choice);
        }else {
            map.put(survey.substring(1), map.get(survey.substring(1)) + choice - 4);
        }
    }
    public String solution(String[] survey, int[] choices) {
        init();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < survey.length ; i++){
            int score = choices[i];
            if(score != 4){
                scoring(survey[i],choices[i]);
            }
        }
        sb.append(map.get("R") >= map.get("T") ? "R" : "T");
        sb.append(map.get("C") >= map.get("F") ? "C" : "F");
        sb.append(map.get("J") >= map.get("M") ? "J" : "M");
        sb.append(map.get("A") >= map.get("N") ? "A" : "N");
        return sb.toString();
    }
}