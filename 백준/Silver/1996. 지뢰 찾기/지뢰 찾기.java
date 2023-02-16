import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] y = {0, 0, 1, -1, 1, -1, 1, -1};
        char[][] ary = new char[N][N];
        char[][] answer = new char[N][N];
        for(int i = 0 ; i < N ; i++){
            ary[i] = s.next().toCharArray();
        }
        for(int i = 0 ; i < N ;  i++)
            for(int j = 0 ; j < N ; j++)
                answer[i][j] = '0';

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                int pt = ary[i][j] == '.' ? 0 : ary[i][j] - '0';
                if(pt != 0){ // 해당 위치 지뢰가 있는 경우
                    answer[i][j] = '*';
                    for(int k = 0 ; k < x.length ; k++){
                        int tmpX = j+ x[k]; // 이동한 x 좌표
                        int tmpY = i + y[k]; // 이동한 y 좌표
                        // 지뢰판을 벗어나가나 지뢰 위치가 아니면
                        if((0 <= tmpX && tmpX < N) && (0 <= tmpY && tmpY < N) && answer[tmpY][tmpX] != '*'){
                            answer[tmpY][tmpX] = (char)(answer[tmpY][tmpX]+pt) - '9' > 0 ? 'M' : (char)(answer[tmpY][tmpX]+pt) ;
                        }
                    }
                }
            }
        }
        for (char[] chars : answer) {
            System.out.println(String.valueOf(chars));
        }
    }

}
