import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i < n ; i++){
            int result[] = new int[10];
            for(int j = 0 ; j < 10 ; j++){
                result[j] = sc.nextInt();
            }
            Arrays.sort(result);
            stringBuffer.append(result[7]);
            if (i < n-1){
                stringBuffer.append("\n");
            }
        }
        System.out.println(stringBuffer);
    }
}