import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sample = "0123456789ABCDEF";
        long result = 0;
        char[] ch = s.next().toCharArray();
        for (int i = ch.length-1,k=0 ; i >= 0 ; i--,k++){
            result += sample.indexOf(ch[i]) * (long)Math.pow(16,k);
        }
        System.out.println(result);

    }
}
