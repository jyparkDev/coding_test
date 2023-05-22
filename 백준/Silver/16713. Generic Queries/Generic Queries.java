import java.util.Scanner;
// N = 1,000,000  / Q = 3,000,000
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] acc = new int[N + 1];

        for (int i = 1 ; i < acc.length ; i++)
            acc[i] = acc[ i - 1 ] ^ sc.nextInt();

        int result = 0;
        while(Q-- > 0 ){
            int i = sc.nextInt();
            int e = sc.nextInt();
            result ^= (acc[e] ^ acc[i - 1]);
        }
        System.out.println(result);

    }
}