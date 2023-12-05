import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> words = new ArrayList<>();
        
        for(int i = 0 ; i < my_string.length()  ; i++ ){
            words.add(my_string.substring(i));
        }

        return words.stream().sorted().toArray(String[]::new);
    }
}