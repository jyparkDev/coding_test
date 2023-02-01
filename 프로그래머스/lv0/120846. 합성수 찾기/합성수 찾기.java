class Solution {
    
    static boolean primeNum (int n){
        for(int i = 2 ; i * i <= n ; i++){
            if(n  % i == 0) return true;
        } 
        return false;
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 4 ; i<=n;i++ ){
            if(primeNum(i)) answer++;
        }
        return answer;
    }
}