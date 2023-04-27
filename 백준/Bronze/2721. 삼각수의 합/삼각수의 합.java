import java.util.Scanner;

public class Main {

    public static int[] sumArr = new int[302];
    public static void main(String[] args) {
        sum();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0 ; i < n ; i++){
            int sum = 0 ;
            for(int j = 1 ; j <= arr[i] ; j++){
                sum += (sumArr[j+1] * j);
            }
            System.out.println(sum);
        }
    }

    // T(n) 구하기
    public static void sum(){
        for (int i = 1; i <= 301; i++) {
            sumArr[i] = sumArr[i-1] + i;
        }
    }
}