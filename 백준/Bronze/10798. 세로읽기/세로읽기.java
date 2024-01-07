import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[5];

        int maxLength = 0;

        for (int i = 0 ; i < 5; i++){
            words[i] = br.readLine();
            int length = words[i].length();
            if ( length> maxLength){
                maxLength = length;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < maxLength ; i++){
            for (int j = 0 ; j < 5 ; j++){
                if (i < words[j].length()){
                    sb.append(words[j].charAt(i));
                }
            }
        }
        System.out.println(sb.toString());

    }
}
