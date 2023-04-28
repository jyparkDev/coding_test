import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        String s;

        while (!(s = br.readLine()).equals("#")){
            String initial = s.substring(0,1);
            int count = s.substring(1).trim().toLowerCase().replace(initial,"*").replaceAll("[^*]","").length();
            buffer.append(initial + " " + count + "\n");
        }
        System.out.println(buffer.toString());
    }
}