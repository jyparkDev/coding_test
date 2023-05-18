import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();
        int max = S1 + S2 + S3;
        int[] num = new int[max+1];

        for(int i = 1 ; i <= S1 ; i++)
            for (int j = 1 ; j <= S2 ; j++)
                for (int k = 1 ; k <= S3 ; k++)
                    num[i+j+k]++;

        int count = 0;
        int result = 0;
        for (int i = 3 ; i <num.length; i++ ){
            int c = num[i];
            if(c > count) {
                count = c;
                result = i;
            }
        }
        System.out.println(result);
    }
}