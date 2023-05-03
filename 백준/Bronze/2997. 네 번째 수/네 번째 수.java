import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num = Integer.MAX_VALUE;
        int[] arr = new int[str.length];
        int result = 0;
        for(int i = 0 ; i < str.length ; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1 ; i++){
            if( arr[i + 1] - arr[i] <= num){
                num = arr[i + 1] - arr[i];
            }
        }

        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] != arr[i-1] + num){
                System.out.println(arr[i-1] + num);
                return;
            }
        }
        System.out.println(arr[2] + num);
    }
}