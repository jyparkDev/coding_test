
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0){
            String numStr[] = br.readLine().split(" ");
            int[] ints = Arrays.stream(numStr).mapToInt(Integer::parseInt).sorted().filter(x -> x % 2 == 0).toArray();
            int min = ints[0];
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.println(sum + " " + min);
        }
        
    }
}
