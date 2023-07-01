import java.util.*;


class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = {0, 0};
        // 이미 나온 단어
        Set<String> existWords = new HashSet<>();
        String word = words[0];
        existWords.add(word);
        for(int i = 2, turn = 1 ; i <= words.length ; i++){
            char target = word.charAt(word.length() - 1);
            String newWord = words[i - 1] ;
            if(target != newWord.charAt(0) || existWords.contains(newWord)){
                result[0] = i % n == 0 ? n : i % n;
                result[1] = turn;
                break;
            }
            existWords.add(newWord);
            word = newWord;
            if(i % n == 0) turn++;
        }
        return result;
    }
}