import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] alpha = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'A']++;
        }

        int count = 0,num = 0;
        char ch = ' ';
        
        for (int i = 0 ; i < 26 ; i++){
            int n = alpha[i];
            if(n != 0){
                if(n > num){
                    ch = (char)('A'+ i );
                    count = 1;
                    num = n;
                }else if(n == num){
                    count++;
                }
            }
        }
        if (count > 1){
            System.out.println("?");
        }else {
            System.out.println(ch);
        }
    }
}