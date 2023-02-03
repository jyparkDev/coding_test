class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1 ; i <= number; i++){
            int num = 0;
            for(int j  = 1 ; j*j <= i ; j++){
                if(i % j == 0) {
                    if(j*j == i) num++;
                    else num+=2;
                }
            }
            answer += num > limit ? power : num;
        }
        return answer;
    }
}