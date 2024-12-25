class Solution {
    public int[][] solution(int n) {
        
        int[] answer[] = new int[n][n];
        int total = n * n;
        int num = 1;
        int row = 0;
        int col = 0;
        answer[0][col] = num++;
        
        for(int dir = 1 ; num <= total; ){
            if (dir == 1){
              for( ; col + 1 < n && answer[row][col + 1] == 0; ) {
                  col++;
                  answer[row][col] = num++;
              }
                dir = 2;
            } else if(dir == 2){
                for( ; row + 1 < n && answer[row + 1][col] == 0; ){
                    row++;
                    answer[row][col] = num++;
                }
                dir = 3;
            } else if(dir == 3){
                for( ; col - 1 >= 0 && answer[row][col -1] == 0 ;){
                    col--;
                    answer[row][col] = num++;
                }
                dir = 4;
            } else{
                for(; row - 1 >= 0 && answer[row - 1][col] == 0;){
                    row--;
                    answer[row][col] = num++;
                }
                dir = 1;
            }
        }
        
        
        return answer;
    }
}