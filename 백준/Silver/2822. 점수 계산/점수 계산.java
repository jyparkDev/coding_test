
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        for(int i = 0 ; i < 8 ; i++){
            arr[i] = sc.nextInt();
        }

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);

        int std = copy[2];

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0 ; i < arr.length; i++){
            int num = arr[i];
            if(num > std){
                sum += num;
                sb.append((i+1)).append(" ");
            }
        }
        System.out.println(sum);
        System.out.println(sb.toString());


    }
}
