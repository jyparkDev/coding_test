import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ok[] = new int[N];
        int result = 0;
        for (int i = 0 ; i < N ; i++){
            ok[i] = sc.nextInt();
        }
        for(int i = 0,sum = 0 ; i < N ; i++){
            if(ok[i] == 1)
                result += ++sum;
            else
                sum = 0;
        }
        System.out.println(result);

    }
}
