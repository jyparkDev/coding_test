import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] numbers = sc.next().toCharArray();
        int digit = sc.nextInt();
        int L = numbers.length;
        int result = 0;
        for(int i = L - 1, pos = 0; i >= 0 ; i--, pos++ ){
            char c = numbers[pos];
            int num = 0;
            if( 'A' <= c && c - 'A' <= 'Z' ) num = c - 'A' + 10;
            else num = c - '0';
            result += num * Math.pow(digit,i);
        }
        System.out.println(result);
    }
}