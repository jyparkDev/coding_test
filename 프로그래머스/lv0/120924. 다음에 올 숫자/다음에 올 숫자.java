class Solution {
    public int solution(int[] common) {
        int answer = 0;
        //공차수열
        if((common[1] - common[0]) == (common[2] - common[1])){
            int d = common[1] - common[0];
            answer = d*common.length + common[0];
        }else{ // 공비수열
            int r = common[1] / common[0];
            for(int i = 1 ; i <= common.length ; i++){
                common[0] *= r;
            }
            answer = common[0];
        }
        return answer;
    }
}