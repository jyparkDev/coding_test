class Solution {
    static int[] x = {0,0,1,-1,-1,1,1,-1};
    static int[] y = {-1,1,0,0,-1,-1,1,1};
    public int solution(int[][] board) {
        int N = board.length;
        int[][] checkBoard = new int[N][N];
        int count = 0;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N; j++){
                if(board[i][j] == 1){
                    checkBoard[i][j] = 1;
                    dangerLocation(i,j,checkBoard);
                }
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N; j++){
                if(checkBoard[i][j] == 0){
                    count++;
                }
            }
        }
        return count;
    }

    private void dangerLocation(int i, int j, int[][] checkBoard) {
        for(int n = 0 ; n < x.length; n++){
            int nx = x[n] + j;
            int ny = y[n] + i;
            if(nx >= 0 && ny >= 0 && nx < checkBoard.length && ny < checkBoard.length){
                checkBoard[ny][nx] = 1;
            }
        }
    }
}