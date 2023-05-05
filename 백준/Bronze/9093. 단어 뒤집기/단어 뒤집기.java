import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        StringBuffer buffer = new StringBuffer();

        for (int i = 0 ; i < str.length ; i++){
            String[] ss = str[i].split(" ");
            for (int j = 0; j < ss.length; j++) {
                StringBuffer tmp = new StringBuffer();
                buffer.append(tmp.append(ss[j]).reverse().toString());
                if (j < ss.length - 1){
                    buffer.append(" ");
                }else{
                    buffer.append("\n");
                }
            }
        }
        System.out.println(buffer.toString());
    }
}