import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int multitab = s.nextInt();
        int result = 0;
        for (int i = 0; i < multitab; i++) {
            result += s.nextInt();
        }
        result -= (multitab-1 * 1);
        System.out.println(result);
    }
}