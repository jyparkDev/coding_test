import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int testCase = s.nextInt();
        while (testCase-- > 0 ){

            System.out.println(logic(s.nextBigInteger()));
        }
    }

    static String logic(BigInteger num){
        BigInteger candy = new BigInteger("0");
        for(int i = 0 ; i < num.intValue() ; i++){
            candy = candy.add(new BigInteger(s.next()));
        }
        return candy.divideAndRemainder(num)[1].intValue() == 0 ? "YES" : "NO";
    }
}