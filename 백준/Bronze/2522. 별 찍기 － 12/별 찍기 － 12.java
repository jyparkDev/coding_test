import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =  s.nextInt();
        for(int i = 1,j=0 ; i <= 2*n-1;i++){
            j += i > n ? -1 : 1;
            System.out.print(" ".repeat(n-j));
            System.out.print("*".repeat(j));
            System.out.println();
        }
    }
}
