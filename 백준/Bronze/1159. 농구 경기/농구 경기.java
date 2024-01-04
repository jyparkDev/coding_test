

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] prefix = new int[26];
        StringBuffer sb = new StringBuffer();
        while (N-- > 0 ){
            prefix[sc.nextLine().charAt(0) - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if (prefix[i] >= 5){
                sb.append((char) ('a' + i));
            }
        }

        System.out.println(sb.length() == 0 ? "PREDAJA" : sb.toString());
    }
}
