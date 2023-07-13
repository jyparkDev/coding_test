class Solution {
    public long solution(int n) {
        long sum = 0 ;
        if( n % 2 == 1){
            for(int i = 1 ; i <= n ; i += 2){
                sum += i;
            }
            return sum ;
        }
        for(int i = 0 ; i <= n ; i += 2){
           sum += i * i;
        }
        return sum;
    }
}