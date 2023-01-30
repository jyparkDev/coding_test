class Solution {
    public int solution(int n) {
        int answer = 0,i=1,j=1, sum =0;
        while (i<= n){
            sum+=j++;
            if(sum>=n){
                if(sum == n)
                    answer++;
                j = ++i;
                sum = 0;
            }
        
        }
        return answer;
    }
}