



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] alpha = new int[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine())!=null){
            char[] c = s.toCharArray();
            for (char cc : c){
                if (cc != ' ') alpha[cc-'a']++;
            }
        }
        int max = 0;
        String str = "";
        for(int i = 0 ; i<alpha.length ; i++){
            if(alpha[i] > max){
                max = alpha[i];
                str =  (char)('a'+i)+"";
            }else if(alpha[i] == max){
                str += (char)('a'+i)+"";
            }
        }
        System.out.println(str);

    }
}
