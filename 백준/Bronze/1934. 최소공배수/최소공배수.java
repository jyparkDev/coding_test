import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0 ; i < n ; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int g = gcd(b,a);
            System.out.println((a*b)/g);
        }
    }

    static int gcd(int a, int b){
        while(b > 0){
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}
