import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String word = br.readLine();
        int targetLength = target.length();
        int wordLength = word.length();
        int num = 0;

        for( int i = 0 ; i <= (targetLength - wordLength) ; ){
            for (int j = 0, count = 0 ; j < wordLength; j++){
                if(target.charAt(i + j) == word.charAt(j)){
                    ++count;
                    if(count == wordLength) {
                        ++num;
                        i += (j + 1);
                    }
                    continue;
                }
                i++;
                break;
            }
        }
        System.out.println(num);
    }
}