import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 0; //해당위치
        int a = 0, b;
        for (int i = 1, sum = 0; ; i++) {
            sum += i;
            if (sum >= n) {
                a = i;
                x = sum - n;
                break;
            }
        }
        if (a % 2 == 0) {
            b = 1;
            while (x-- > 0) {
                a--;
                b++;
            }
        } else {
            b = a;
            a = 1;
            while (x-- > 0) {
                b--;
                a++;
            }
        }
        System.out.printf("%d/%d\n", a, b);
    }
}