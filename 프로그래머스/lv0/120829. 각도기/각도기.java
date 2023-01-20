class Solution {
    public int solution(int angle) {
        int num = angle / 90;
        int num2 = angle % 90;
        int answer = 0;
        if(num == 0)return 1;
        else if(num == 1)
            if(num2 == 0)return 2;
            else return 3;
        else return 4;
    }
}