
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        while ( !(word = sc.nextLine()).equals("0")){
            int L = 0;
            int R = word.length() - 1;
            boolean check = true;
            while (L <= R){
                if (word.charAt(L++) != word.charAt(R--)){
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "yes" : "no");
        }
    }
}
