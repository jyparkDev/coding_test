class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for(int n : num_list){
            mul *= n;
            sum += n;
        }
        
        return mul < (sum * sum) ? 1 : 0;
    }
}