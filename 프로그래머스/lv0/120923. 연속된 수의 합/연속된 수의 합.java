class Solution {
    public int[] solution(int num, int total) {
        int[] answer ;
        int dp=1 , upp = num;
        int sum_status = 0;
        for(int i = 1 ; i <= num ; i++){
            sum_status += i;
        }
        while (sum_status != total){
            if(sum_status < total){
                sum_status -= dp++;
                sum_status += ++upp;
            }else{
                sum_status -= upp--;
                sum_status += --dp;
            }
        }
        answer = new int[num];
        for(int i = dp ,k=0 ; i <= upp ; i++){
            answer[k++] = i;
        }
        return answer;
    }
}