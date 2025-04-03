import java.util.*;
import java.time.LocalDate;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termsMap = getTermsMap(terms);
        String[] sltToday = today.split("\\.");
        LocalDate localToday = LocalDate.of(Integer.parseInt(sltToday[0]), Integer.parseInt(sltToday[1]), Integer.parseInt(sltToday[2]));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < privacies.length ; i++){
            String[] slt = privacies[i].split(" ");
            int term = termsMap.get(slt[1]);
            String[] target = slt[0].split("\\.");
            LocalDate targetday = LocalDate.of(Integer.parseInt(target[0]), Integer.parseInt(target[1]), Integer.parseInt(target[2]));
            LocalDate date = targetday.plusMonths(term);
            if(date.isBefore(localToday) || date.isEqual(localToday)){
                list.add(i +1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
    
        public Map<String,Integer> getTermsMap(String[] terms){
        HashMap<String, Integer> map = new HashMap<>();

        for (String term : terms) {
            String[] slt = term.split(" ");
            map.put(slt[0], Integer.valueOf(slt[1]));
        }

        return map;
    }
}