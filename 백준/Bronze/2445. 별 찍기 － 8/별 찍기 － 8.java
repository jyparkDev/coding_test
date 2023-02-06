import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1,j=1; i <= 2*n-1;i++){
            String star = "*".repeat(j);
            String tmp = " ".repeat((2*n)-(j*2));
            System.out.print(star);
            System.out.print(tmp);
            System.out.print(star);
            System.out.println();
            j += i >= n ? -1: 1;
        }
    }
}
