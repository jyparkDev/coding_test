import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            String[] str = br.readLine().split(" ");
            BigInteger a = new BigInteger(str[0],2);
            BigInteger b = new BigInteger(str[1],2);
            System.out.println(a.add(b).toString(2));
        }
    }
}
