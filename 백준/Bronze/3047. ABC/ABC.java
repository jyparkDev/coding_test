import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num[] = new int[3];
        for(int i = 0 ; i < num.length ; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        char[] alpha = sc.next().toCharArray();
        for(int i = 0 ; i < alpha.length ; i++){
           sb.append(num[alpha[i]-'A']+" ");
        }
        System.out.println(sb.toString());
    }
}