
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] paints = new String[N][5];

        int[] result = new int[2];
        int amount = Integer.MAX_VALUE;

        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < 5 ; j++){
                String in = br.readLine();
                paints[i][j] = in;
            }
        }

        for(int i = 0 ; i < N - 1; i++){
            for(int j = i + 1 ; j < N ; j++ ){
                int tmp = sameCount(paints[i], paints[j]);
                if (tmp < amount){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    amount = tmp;
                }
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }

    private static int sameCount(String[] p1, String[] p2){

        int amount = 0;
        for(int i = 0 ; i < 5 ; i++){
            char[] c1 = p1[i].toCharArray();
            char[] c2 = p2[i].toCharArray();
            for(int k = 0 ; k < c1.length ; k++){
                if(c1[k] != c2[k]) {
                    amount++;
                }
            }
        }
        return amount;
    }
}
