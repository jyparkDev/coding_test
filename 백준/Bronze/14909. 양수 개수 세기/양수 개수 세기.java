import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int count = 0;
        for(int i = 0 ; i < tmp.length ; i++){
            if(Integer.parseInt(tmp[i])>0) count++;
        }

        System.out.println(count);
    }
}
