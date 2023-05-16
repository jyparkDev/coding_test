import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[9];
        int sum = 0;
        for (int i = 0 ; i < h.length ; i++)
            sum += h[i] = sc.nextInt();

        int[] result = new int[7];
        for(int i = 0 ; i < 8 ; i++){
            boolean check = false;
            for(int j = i + 1 ; j < 9 ; j++){
                if(sum - h[i] - h[j] == 100){
                    for(int k = 0, idx = 0 ; k < 9 ; k++){
                        if(k != i && k != j){
                            result[idx++] = h[k];
                        }
                    }
                    check = true;
                    break;
                }
            }
            if(check) break;
        }
        Arrays.sort(result);
        for (int i : result) {
            System.out.println(i);
        }
    }
}