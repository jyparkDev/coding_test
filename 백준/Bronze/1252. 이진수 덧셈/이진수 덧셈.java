import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger(2);
        BigInteger b = s.nextBigInteger(2);
        System.out.println(a.add(b).toString(2));
    }
}
