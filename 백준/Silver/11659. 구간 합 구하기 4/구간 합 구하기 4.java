import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] acc = new int[N + 1];

        for(int i = 1 ; i < acc.length ; i++)
            acc[i] = acc[ i - 1 ] + sc.nextInt();

        while(M-- > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(acc[j] - acc[i - 1 ]);
        }
    }
}