import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //행 길이
        int N = sc.nextInt();
        //열 길이
        int M = sc.nextInt();
        //관찰 시간
        int T = sc.nextInt();
        // 기준 정수
        int K = sc.nextInt();
        // 결정정수
        int A = sc.nextInt();
        int B = sc.nextInt();

        char[][] map = new char[N + 1][M + 1];
        for(int i = 1 ; i <= N ; i++){
            String rowMap = sc.next();
            for(int j = 1 ; j <= M ; j++)
                map[i][j] = rowMap.charAt(j - 1);
        }

        while(T-- > 0){
            int[][] acc = getPrefixSum(map);
            for(int i = 1 ; i <= N ; i++)
                for(int j = 1; j <= M ; j++){
                    int nearAlive = getRangeSum(acc , i , j , K);
                    if(map[i][j] == '*'){
                        nearAlive--;
                        if (nearAlive < A || B < nearAlive )
                            map[i][j] = '.';
                    }
                    else if(A < nearAlive && nearAlive <= B)
                        map[i][j] = '*';
                }
        }

        for(int i = 1 ; i <= N ; i++){
            for (int j = 1 ; j <= M ; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }

    static int getRangeSum(int[][] acc, int r, int c, int k) {
        int r1 = Math.max(r - k, 1);
        int c1 = Math.max(c - k, 1) ;
        int r2 = Math.min(r + k, acc.length - 1);
        int c2 = Math.min(c + k, acc[0].length - 1);

        return acc[r2][c2] - acc[r2][c1 - 1] - acc[r1 - 1][c2] + acc[r1 - 1][c1 - 1];
    }

    static int[][] getPrefixSum(char[][] map) {
        int[][] acc = new int[map.length][map[0].length];
        for(int i = 1 ; i < map.length; i++)
            for(int j = 1 ; j < map[0].length ; j++)
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1]
                    + (map[i][j] == '*' ? 1 : 0);
        return acc;
    }
}
