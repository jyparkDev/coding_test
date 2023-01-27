class Solution {
    public String solution(int a, int b) {
       int count = 0;
        final String[] TODAYS = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        final int[] DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i = 1 ; i < a; i++)
            count+=DAYS[i-1];
        return TODAYS[(count+=b-1)%7];
    }
}