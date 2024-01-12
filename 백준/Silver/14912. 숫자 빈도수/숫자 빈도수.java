
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        String d = str[1];
        StringBuilder sb = new StringBuilder();

        int count = 0 ;

        for(int i = 1 ; i <= N ; i++){
            sb.append(i);
        }
        System.out.println(sb.toString().replaceAll("[^"+d+"]","").length());
    }
}
