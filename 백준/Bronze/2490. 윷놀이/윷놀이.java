import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] score = {"D","C","B","A","E"};
        for (int i = 0 ; i < 3 ; i++){
            int result = 0 ;
            for(int j = 0 ; j < 4 ;j++){
                result += s.nextInt();
            }
            System.out.println(score[result]);
        }
    }
}
