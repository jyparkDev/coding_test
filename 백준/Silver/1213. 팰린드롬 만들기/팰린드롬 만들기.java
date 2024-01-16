import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char[] spell = word.toCharArray();

        int[] counts = new int[26];

        for (char c : spell) {
            counts[c - 'A']++;
        }

        boolean check = word.length() % 2 == 0;
        char centerChar = 'A';
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < 26; i++) {
            int count = counts[i];
            char ch = (char) ('A' + i);
            if (count == 0){
                continue;
            }
            if (count % 2 == 1) {
                if (check) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                check = true;
                centerChar = ch;
            }
            for (int j = 0; j < count / 2; j++) {
                sb.append(ch);
            }
        }


        String pref = sb.toString();
        String surf = sb.reverse().toString();
        String mid = check &&  word.length() % 2 == 1 ? centerChar + "" : "";
        System.out.println(pref + mid + surf);

    }
}
