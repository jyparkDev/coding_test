import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static char[][] copyBoard(char[][] board){
        char[][] tmpBoard = new char[board.length][];
        for (int i = 0; i < board.length; i++)
            tmpBoard[i] = Arrays.copyOf(board[i], board.length);
        return tmpBoard;
    }

    public static int countCandy(char[][] board){

        int result = 0 ;

        for (int i = 0; i < board.length; i++) {
            char candy = ' ';
            int count = 0, max = 0;
            for (int j = 0 ; j < board.length; j++){
                if (candy == board[i][j]) count++;
                else{
                    count = 1;
                    candy = board[i][j];
                }
                if(count >= max){
                    max = count;
                }
            }
            if( max >= result) result = max;
        }
        for (int i = 0; i < board.length; i++) {
            char candy = ' ';
            int count = 0, max = 0;
            for (int j = 0 ; j < board.length; j++){
                if (candy == board[j][i]) count++;
                else{
                    count = 1;
                    candy = board[j][i];
                }
                if(count >= max){
                    max = count;
                }
            }
            if( max >= result) result = max;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[][] board = new char[N][];
        for (int i = 0; i < N; i++)
            board[i] = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0 ; j < N - 1; j++){
                if( board[i][j] != board[i][j+1]){
                    char[][] copBoard = copyBoard(board);
                    char tmp = copBoard[i][j];
                    copBoard[i][j] = copBoard[i][j+1];
                    copBoard[i][j+1] = tmp ;
                    int r = countCandy(copBoard);
                    if(r == N){
                        System.out.println(N);
                        return;
                    }
                    if (r >= count)
                        count = r;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0 ; j < N - 1; j++){
                if( board[j][i] != board[j+1][i]){
                    char[][] copBoard = copyBoard(board);
                    char tmp = copBoard[j][i];
                    copBoard[j][i] = copBoard[j+1][i];
                    copBoard[j+1][i] = tmp ;
                    int r = countCandy(copBoard);
                    if(r == N){
                        System.out.println(N);
                        return;
                    }
                    if (r >= count)
                        count = r;
                }
            }
        }
        System.out.println(count);
    }
}
