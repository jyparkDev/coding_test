import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        char[] ch = s.next().toCharArray();
        int[] arr = new int[26];

        for (char c : ch) {
            arr[c - 'a']++;
        }

        for (int i : arr) {
            buffer.append(i + " ");
        }

        System.out.println(buffer.toString().trim());
    }
}