class Solution {
    public int solution(int n) {
        if(n == 1) return 1;
        int i, answer = 0;
        for(i = 1 ; i * i < n ; i++){
            if(n % i == 0) answer += 2;
        }
        return i * i == n ? answer +=1 : answer;
    }
}