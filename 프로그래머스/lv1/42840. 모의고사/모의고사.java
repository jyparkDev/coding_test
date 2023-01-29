import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        Map<Integer,Integer> rst =checkScore(answers);
        return rank(rst);
    }
    
    static Map<Integer, Integer> checkScore(int[] answers){
        int[][] badStudent = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        Map<Integer,Integer> rst  = new HashMap<>();
        rst.put(1,0);
        rst.put(2,0);
        rst.put(3,0);
        for(int i = 0 ; i < answers.length ; i++){
            int ok = answers[i];
            if(badStudent[0][i % badStudent[0].length] == ok){
                rst.put(1,rst.get(1)+1);
            }
            if(badStudent[1][i % badStudent[1].length] == ok){
                rst.put(2,rst.get(2)+1);
            }
            if(badStudent[2][i % badStudent[2].length] == ok){
                rst.put(3,rst.get(3)+1);
            }
        }
        return rst;
    }
    
    static int[] rank(Map<Integer,Integer> rst){
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer key : rst.keySet())
            list.add(rst.get(key));
        int num = list.stream().mapToInt(x->x).max().getAsInt();
        list = new ArrayList<>();
        for (Integer key : rst.keySet()){
            if(num == rst.get(key)) list.add(key);
        }
        return list.stream().sorted().mapToInt(x->x).toArray();
    }
    
}