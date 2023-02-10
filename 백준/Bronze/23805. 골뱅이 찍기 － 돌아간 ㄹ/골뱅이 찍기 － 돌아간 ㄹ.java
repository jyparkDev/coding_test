import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String start = "@".repeat(3 * n) + " ".repeat(n) + "@".repeat(n);
        String mid = "@".repeat(n) + " ".repeat(n) + "@".repeat(n) + " ".repeat(n)+"@".repeat(n);
        String end = "@".repeat(n) + " ".repeat(n) + "@".repeat(3 * n);
        for (int i = 0; i < n; i++) {
            System.out.println(start);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mid);
            System.out.println(mid);
            System.out.println(mid);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(end);
        }
    }
}