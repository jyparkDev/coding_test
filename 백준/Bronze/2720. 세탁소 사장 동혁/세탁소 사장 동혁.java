import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] pay = {25,10,5,1};
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            money[i] = s.nextInt();
        }

        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 4 ; j++){
                int divide = money[i] / pay[j];
                money[i] %= pay[j];
                System.out.print(divide + " ");
            }
            System.out.println();
        }
    }
}