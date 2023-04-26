import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        String[] s = new String[n];
        if( n == 0 || m == 0) return;
        for(int i = 0 ; i < n ; i++){
            s[i] = stdIn.next();
        }

        for (int i = 0 ; i < n ; i++){
            System.out.println( new StringBuilder(s[i]).reverse().toString());
        }
    }
}