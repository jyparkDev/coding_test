import java.util.*;

class Solution {
    
    private Map<String,Integer> codeMap = new HashMap<>();
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        init();
        return Arrays.stream(data)
                .filter( d -> d[codeMap.get(ext)] < val_ext)
                .sorted((o1, o2) -> o1[codeMap.get(sort_by)] < o2[codeMap.get(sort_by)] ? -1 : 1)
                .toArray(int[][]::new);
    }
    
    private void init(){
        codeMap.put("code", 0);
        codeMap.put("date", 1);
        codeMap.put("maximum", 2);
        codeMap.put("remain", 3);
    }
}