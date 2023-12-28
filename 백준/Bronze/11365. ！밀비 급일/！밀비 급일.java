import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String input = "";

        while(!(input = sc.nextLine()).equals("END")){
            sb.append(input).append("\n");
        }

        String[] words = sb.toString().split("\n");

        delete(sb);

        for (String w : words) {
            String result = sb.append(w).reverse().toString();
            delete(sb);
            System.out.println(result);
        }
    }

    private static void delete(StringBuffer sb) {
        sb.delete(0, sb.length());
    }
}