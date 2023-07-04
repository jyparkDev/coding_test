class Solution {
    public int solution(int[] num_list, int n) {
        for(int n1 : num_list){
            if(n1 == n )
                return 1;
        }
        return 0;
    }
}