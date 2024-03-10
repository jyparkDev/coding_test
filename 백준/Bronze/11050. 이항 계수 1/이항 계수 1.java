import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int N = c.nextInt();
        int K = c.nextInt();
        int[] sum = new int[11];
        sum[0] = 1;
        sum[1] = 1;
        for (int i = 2 ; i < sum.length ;i++){
            sum[i] = i * sum[i - 1 ] ;
        }

        int num1 = sum[N] / sum[N - K];
        System.out.println(num1 / sum[K]);

    }
}
