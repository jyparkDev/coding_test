import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        while (true){
            if(a == b && a == 0) break;
            System.out.println(a+b);
            a = s.nextInt();
            b= s.nextInt();
        }
    }
}
