import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int N = Integer.parseInt(st[0]);
        int M = Integer.parseInt(st[1]);

        int[][] board = new int[N + 1][N + 1];

        for(int i = 1 ; i < board.length ; i++){
            String[] str = br.readLine().split(" ");
            for (int j = 1 ; j < board[i].length ; j++)
                board[i][j] = board[i][j - 1] + Integer.parseInt(str[j - 1]);
        }

        while (M-- > 0){
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);
            int sum = 0;
            for(int i = x1 ; i <= x2 ; i++){
                sum += board[i][y2] - board[i][y1 - 1];
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
