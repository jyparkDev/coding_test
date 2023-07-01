import java.math.BigInteger;
import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int l = p.length();
        BigInteger target = new BigInteger(p);
        int count = 0;
        for (int i = 0 ; i <= t.length() - l; i++){
            BigInteger num = new BigInteger(t.substring(i, i + l));
            if(num.compareTo(target) <= 0){
                count++;
            }
        }
        return count;
    }
}