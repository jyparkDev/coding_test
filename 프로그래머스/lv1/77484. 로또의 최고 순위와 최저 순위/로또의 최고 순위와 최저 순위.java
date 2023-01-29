class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
       int[] result = new int[2];
        int emptyCount = 0 ;
        int okNum = 0;
        int i = 0,j=0;
        while (i < lottos.length){
            if(j == lottos.length - 1 || lottos[i] == win_nums[j] ) {
                if (lottos[i] == win_nums[j]) okNum++;
                j= 0 ; i++;
                continue;
            }else if(lottos[i] == 0){
                i++; emptyCount++;
                continue;
            }
            j++;
        }
        result[0] = 7- okNum - emptyCount <= 5 ? 7- okNum - emptyCount : 6;
        result[1] = 7-okNum <=5 ? 7-okNum : 6;
        return result;
    }
}