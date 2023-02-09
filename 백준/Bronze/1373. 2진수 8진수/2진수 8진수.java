import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger b = s.nextBigInteger(2);
        System.out.println(b.toString(8));
    }
}
