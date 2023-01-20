class Solution {
    public int solution(int slice, int n) {
        int answer ;
        for(answer=0 ; (answer * slice) < n ; answer++ );
        return answer;
    }
}