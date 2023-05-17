import java.util.Scanner;

public class Main {
    public static final char[] pattern = {46,124,45,43};

    static void drawX(char[][] b, int r, int c, int nr ,int nc){
        b[r][c] = b[r][c] == pattern[1] || b[r][c] == pattern[3] ? pattern[3] : pattern[2];
        b[nr][nc] = b[nr][nc] == pattern[1] || b[nr][nc] == pattern[3] ? pattern[3] : pattern[2];
    }

    static void drawY(char[][] b, int r, int c,int nr ,int nc){
        b[r][c] = b[r][c] == pattern[2] || b[r][c] == pattern[3] ? pattern[3] : pattern[1];
        b[nr][nc] = b[nr][nc] == pattern[2] || b[nr][nc] == pattern[3]? pattern[3] : pattern[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.hasNext() ? sc.next() : "";
        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = pattern[0];

        int r = 0, c = 0;

        for (int i = 0 ; i < input.length() ; i++){
            char d = input.charAt(i);
            int nr = r,nc = c;

            switch (d){
                case 'L': nc -= 1; break;
                case 'R': nc += 1; break;
                case 'U': nr -= 1; break;
                case 'D': nr += 1; break;
            }

            if(nc < 0 || nc >= N || nr < 0 || nr >= N) continue;
            if (d == 'L' || d == 'R')
                drawX(board,r,c,nr,nc);
            else
                drawY(board,r,c,nr,nc);
            r = nr; c = nc;
        }

        for (char[] cc : board) {
            System.out.println(cc);
        }
    }
}
