import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        BigInteger b = new BigInteger(str[0]);
        System.out.println(b.toString(Integer.parseInt(str[1])).toUpperCase());
    }
}