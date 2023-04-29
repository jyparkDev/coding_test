import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i ; j <= n; j++) {
                result += (i + j);
            }
        }
        System.out.println(result);
    }
}
