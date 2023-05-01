import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int y = 0;
        while( str.length() >= 2){
            ++y;
            int sum = 0;
            char[] ch = str.toCharArray();
            for (char c : ch) {
                sum += c - '0';
            }
            str = String.valueOf(sum);
        }
        str = Integer.parseInt(str) % 3 == 0 ? "YES" : "NO";
        System.out.printf("%d\n%s",y,str);

    }
}