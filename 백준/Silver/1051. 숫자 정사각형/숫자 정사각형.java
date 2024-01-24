
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");

        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]);

        String[] numbers = new String[N];
        for (int i = 0 ; i < N ; i++){
            numbers[i]  = br.readLine();
        }

        int maxLength = Math.min(N,M);
        int result = 0;
        for (int l = 0 ; l <= maxLength ; l++){

            for (int startRow = 0 ; startRow + l < N ; startRow++){
                int endRow = startRow + l;
                for (int startCol = 0; startCol + l < M; startCol++) {
                    int endCol = startCol + l;
                    if (numbers[startRow].charAt(startCol) == numbers[startRow].charAt(endCol)
                            && numbers[startRow].charAt(startCol) == numbers[endRow].charAt(startCol)
                            && numbers[startRow].charAt(startCol) == numbers[endRow].charAt(endCol)){
                        result = l + 1;
                    }
                }
            }

        }
        System.out.println(result * result);

    }
}
