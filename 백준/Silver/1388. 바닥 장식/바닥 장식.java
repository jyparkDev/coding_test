import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");

        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        boolean[][] checkPosition = new boolean[row][col];
        char[][] floor = new char[row][];

        for (int i = 0 ; i < row ; i++){
            floor[i] = br.readLine().toCharArray();
        }

        int boardAmount = calculator(row, col, checkPosition, floor);

        System.out.println(boardAmount);

    }

    private static int calculator(int row, int col, boolean[][] checkPosition, char[][] floor){
        int boardAmount = 0;

        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                if (checkPosition[i][j]){
                    continue;
                }
                checkPosition[i][j] = true;
                char c = floor[i][j];
                if (c == '-'){
                    for (int k = j + 1 ; k < col; k++){
                        if (floor[i][k] != c){
                            break;
                        }
                        checkPosition[i][k] = true;
                    }
                }else{
                    for (int k = i + 1 ; k < row; k++){
                        if (floor[k][j] != c){
                            break;
                        }
                        checkPosition[k][j] = true;
                    }
                }
                boardAmount++;
            }
        }
        return boardAmount;
    }
}
