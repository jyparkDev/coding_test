
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int ZR = Integer.parseInt(input[2]);
        int ZC = Integer.parseInt(input[3]);

        String[] word = new String[R];
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < R ; i++){
            String[] words = br.readLine().split("");
            String tmp = "";
            for (int j = 0 ; j < words.length ; j++){
                tmp += words[j].repeat(ZC);
            }
            word[i] = tmp;
        }

        for (int i = 0 ; i < R; i++){
            for (int j = 0 ; j < ZR ; j++){
                sb.append(word[i]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
