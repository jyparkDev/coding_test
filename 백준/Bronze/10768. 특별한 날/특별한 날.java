import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int d = s.nextInt();
        if(m == 2){
            if(d <18 )
                System.out.println("Before");
            else if(d==18)
                System.out.println("Special");
            else
                System.out.println("After");
        }else if(m < 2){
            System.out.println("Before");
        }else{
            System.out.println("After");
        }
    }
}
