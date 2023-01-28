class Solution {
    public int solution(int hp) {
        int power = 5;
        int answer = 0;
        while(power >= 1){
            answer += (hp / power);
            hp %= power;
            power -= 2;
        }
       
        return answer;
    }
}