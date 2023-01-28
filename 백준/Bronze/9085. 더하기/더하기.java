import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0 ; i < n ; i++){
            int k = s.nextInt();
            int result = 0;
            for(int j = 0 ; j < k ; j++){
                result += s.nextInt();
            }
            System.out.println(result);
        }
    }
}
