import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger big = s.nextBigInteger(8);
        System.out.println(big.toString(2));
    }
}
