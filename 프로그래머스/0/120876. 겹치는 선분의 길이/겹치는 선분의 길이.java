import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[][] lines) {
        
        int tot = 0;
        int cur = 0;
        
        int min = Math.min(Math.min(lines[0][0],lines[1][0]),lines[2][0]);
        int max = Math.max(Math.max(lines[0][1],lines[1][1]),lines[2][1]);
        
        for(int i = min ; i <= max ; i++){
            int p = 0;
            
            if(lines[0][0] < i && i <= lines[0][1] ){
                p++;
            }
            if(lines[1][0] < i && i <= lines[1][1] ){
                p++;
            }
            if(lines[2][0] < i && i <= lines[2][1] ){
                p++;
            }
            
            if( p >= 2){
                cur++;
            } else{
                tot += cur;
                cur = 0;
            }
        }
        
        tot += cur;
        return tot;
    }
}