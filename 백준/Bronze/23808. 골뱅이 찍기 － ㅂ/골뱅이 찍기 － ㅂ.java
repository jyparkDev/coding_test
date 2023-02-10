
import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String start = "@".repeat(n)+" ".repeat((5*n)-(n*2))+"@".repeat(n);
        String mid =  "@".repeat(n*5);
        for (int i = 0; i < n; i++) {
            System.out.println(start);
            System.out.println(start);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mid);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(start);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mid);
        }
    }
}