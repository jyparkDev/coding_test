import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("@".repeat(N+2));
        for (int i = 1 ; i <=N ; i++){
            System.out.print("@");
            System.out.print(" ".repeat(N));
            System.out.print("@");
            System.out.println();
        }
        System.out.println("@".repeat(N+2));

    }
}
