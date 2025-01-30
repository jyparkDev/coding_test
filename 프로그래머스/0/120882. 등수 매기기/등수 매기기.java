import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] sumScore = new int[score.length]; // 합계점수
        int[] tmp = new int[score.length];
        int[] result = new int[score.length];;
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        for(int i = 0 ; i < sumScore.length ; i++){
            tmp[i] = sumScore[i] = score[i][0] + score[i][1];
        }


        Arrays.sort(tmp);

        for(int i = tmp.length - 1,rank = 1 ; i >= 0 ; i--){
            if(!rankMap.containsKey(tmp[i])){
                rankMap.put(tmp[i],rank);
            }
            rank++;
        }

        for(int i = 0 ; i < sumScore.length; i++){
            result[i] = rankMap.get(sumScore[i]);
        }
        
        
        return result;
    }
}