class Solution {
     public int solution(int left, int right) {
        int answer = 0;
        for (int i = left ; i <= right ; i++){
            answer += calculate(i) * i;
        }
        return answer;
    }
    static int calculate(int num){
        int result = 0;
        for(int i = 1 ; i <= num  ; i++){
            if(num % i == 0) result++;
        }
        return result % 2 == 0 ? 1 : -1;
    }
}