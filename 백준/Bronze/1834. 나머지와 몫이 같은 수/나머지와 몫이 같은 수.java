import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = s.nextInt();
        long sum = 0;
        for(int i = 1 ; i < num ; i++){
            sum += (num * i) + (i % num);
        }
        System.out.println(sum);
    }
}
