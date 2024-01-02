

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine();
        String[] words = sc.nextLine().split("");
        String[][] wordBoard = new String[words.length/K][K];
        StringBuffer sb = new StringBuffer();
        for(int i = 0, k = 0 ; i < wordBoard.length ; i++){
            if( i % 2 == 0){
                for(int j = 0 ; j < K ; j++){
                    wordBoard[i][j] = words[k++];
                }
            }else{
                for(int j = K - 1; j >= 0 ; j--){
                    wordBoard[i][j] = words[k++];
                }
            }
        }

        for(int i = 0 ; i < K ; i++){
            for(int j = 0 ; j < wordBoard.length ; j++){
                sb.append(wordBoard[j][i]);
            }
        }

        System.out.println(sb.toString());
    }
}
