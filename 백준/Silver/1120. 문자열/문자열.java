import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int count = 0;
            for(int j = 0; j < A.length() ; j++){
                if(A.charAt(j) != B.charAt(i + j)){
                    count++;
                }
            }
            if (count < sum){
                sum = count;
            }
        }
        System.out.println(sum);
    }
}
