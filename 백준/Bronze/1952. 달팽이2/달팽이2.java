import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int checkCount = 0;
        boolean board[][] = new boolean[row][col];
        board[0][0] = true;
        checkCount++;

        int rowDir = 0;
        int colDir = 0;
        char dir = 'R';

        while (true) {
            if (dir == 'R'){
                colDir++;
                if (colDir == col || board[rowDir][colDir]){
                    dir = 'D';
                    colDir--;
                    count++;
                    continue;
                }
            } else if(dir == 'D'){
                rowDir++;
                if(rowDir == row || board[rowDir][colDir]){
                    dir = 'L';
                    rowDir--;
                    count++;
                    continue;
                }

            } else if(dir == 'L'){
                colDir--;
                if( colDir < 0 || board[rowDir][colDir]){
                    dir = 'U';
                    colDir++;
                    count++;
                    continue;
                }
            } else if(dir == 'U') {
                rowDir--;
                if(rowDir < 0 || board[rowDir][colDir]){
                    dir = 'R';
                    rowDir++;
                    count++;
                    continue;
                }
            }

            board[rowDir][colDir] = true;
            if (++checkCount == row * col){
                break;
            }
        }
        System.out.println(count);
    }

}
