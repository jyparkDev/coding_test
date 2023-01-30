import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> poket = new Stack<>();
        int result = 0;
        for(int i = 0 ; i < moves.length ; i++){
            int col = moves[i];
            int choice = 0;
            for(int j = 0; j < board.length; j++){
                if(board[j][col-1] != 0){
                    choice = board[j][col-1];
                    board[j][col-1] = 0 ;
                    break;
                }
            }
            if (choice != 0){
                if (poket.size() == 0) {
                    poket.push(choice);
                }else{
                    int num = poket.peek();
                    if(num == choice){
                        poket.pop();
                        result+=2;
                    }else{
                        poket.push(choice);
                    }
                }
            }
        }
        return result;
    }
}