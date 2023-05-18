import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] alphabet = new boolean[26];
        int N = sc.nextInt();
        int K = sc.nextInt();
        int pt = 0;
        String[] rullet = new String[N];

        for (int i = 0 ; i < N ; i++)
            rullet[i] = "?";

        while(K-- > 0){
            int num = sc.nextInt();
            String word = sc.next();
            pt = (pt + num) % N;
            if(!rullet[pt].equals("?") && !rullet[pt].equals(word)){
                System.out.println("!");
                return;
            }
            if(alphabet[word.charAt(0) - 'A'] && rullet[pt].equals("?")){
                System.out.println("!");
                return;
            }
            rullet[pt] = word;
            alphabet[word.charAt(0) - 'A'] = true;
        }

        for(int i = 0 ; i < N ; i++){
            System.out.print(rullet[pt-- % N]);
            if (pt < 0) pt = N-1;
        }
    }
}