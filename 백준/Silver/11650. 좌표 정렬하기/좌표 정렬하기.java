import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            matrix[i][0] = Integer.parseInt(str[0]);
            matrix[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        for(int i = 0 ; i < N ; i++)
            System.out.println(matrix[i][0] + " " + matrix[i][1]);
    }
}
