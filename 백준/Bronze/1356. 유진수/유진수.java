

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int nLength = N.length();

        if (N.length() >= 2){
            for (int i = 0 ; i < nLength ; i++){
                String s1 = N.substring(0, i);
                String s2 = N.substring(i);
                if(calc(s1) == calc(s2)){
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");

    }

    private static long calc(String s){
        long n = 1;
        char[] cNum = s.toCharArray();
        for (char c : cNum) {
            n *= (c - '0');
        }
        return n;
    }
}
