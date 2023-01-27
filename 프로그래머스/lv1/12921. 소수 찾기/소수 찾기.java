import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int count = 0;
        Outer:for(int i = 2; i <= n; i++){
            for(int j=2; j*j <= i ; j++){
                if(i % j == 0 ) continue Outer;
            }
            count++;
        }
        return count;
    }
}