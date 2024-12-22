import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        Set<Integer> set = new LinkedHashSet<>();
        
        int i = 2;
        
        while(i <= n){
            if(n % i == 0){
                set.add(i);
                n /= i;
                continue;
            }
            i++;
        }
        
        
        return set.stream().mapToInt(x -> x).toArray();
    }
}