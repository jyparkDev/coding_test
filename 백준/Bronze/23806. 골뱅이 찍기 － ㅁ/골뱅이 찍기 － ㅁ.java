import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String start = "@".repeat(5* n);
        String mid = "@".repeat(n) + " ".repeat((5*n)-(n*2)) +"@".repeat(n);
        for (int i = 0; i < n; i++) {
            System.out.println(start);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mid);
            System.out.println(mid);
            System.out.println(mid);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(start);
        }
    }
}