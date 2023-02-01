import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k  = sc.nextInt();
        int n = sc.nextInt();
        n =(m*k)-n  <= 0 ? 0 : (m*k)-n;
        System.out.println(n);
    }
}
