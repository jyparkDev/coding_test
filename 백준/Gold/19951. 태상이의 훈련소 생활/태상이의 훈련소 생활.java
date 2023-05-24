import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 연병장 칸 수
        int N = sc.nextInt();
        // 조교 수
        int M = sc.nextInt();
        // 각 칸의 높이
        int[] H = new int[N + 1];
        for(int i = 1 ; i <= N ; i++)
            H[i] = sc.nextInt();

        int[] delta = new int[N + 2];
        while(M-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            delta[a] += k;
            delta[b + 1] -= k;
        }

        int[] accDelta = new int[N + 1];

        for(int i = 1 ; i <= N ; i++)
            accDelta[i] += accDelta[i - 1] + delta[i];


        for(int i = 1 ; i <= N ; i++)
            System.out.print(H[i] + accDelta[i]+ " ");
    }
}
