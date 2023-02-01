import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] chest= new String[8][8];
        int result = 0;
        for(int i = 0 ; i < 8 ; i++){
            chest[i] = s.next().split("");
        }
        for (int i = 0 ; i < 8 ;i++){
            for(int j = i%2 ; j < 8 ; j+=2){
                if(chest[i][j].equals("F"))
                    result++;
            }
        }
        System.out.println(result);
    }
}
