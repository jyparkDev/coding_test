import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] score = new int[7];
        Set<Integer> set = new HashSet<>();
        score[a]++; score[b]++; score[c]++; score[d]++;
        set.add(a); set.add(b); set.add(c); set.add(d);
        
        if(set.size() == 1){
            return 1111 * a;
        }
        
        if(set.size() == 4){
            return Math.min(Math.min(Math.min(a,b),c),d);
        }
        
        if(set.size() == 3){
            int sum = 1;
            for(int i = 1; i < score.length ; i++){
                if(score[i] == 2 || score[i] == 0){
                    continue;
                }
                sum *= i;
            }
            return sum;
        }
        
         if(set.size() == 2){
             boolean same = false;
             int[] tmp = new int[2];
             for(int i = 1, idx = 0 ; i < score.length; i++){
                 if(score[i] != 0){
                     if(score[i] == 2){
                         same = true;
                         tmp[idx++] = i;
                     } else if(score[i] == 1){
                         tmp[0] = i;
                     } else {
                         tmp[1] = i;
                     }
                 }
             }
             if(same){
                 return (tmp[0] + tmp[1]) * (Math.abs(tmp[0] - tmp[1]));
             }else{
                 return (10 * tmp[1] + tmp[0]) * (10 * tmp[1] + tmp[0]);
             }
         }
        return 0;
    }
}