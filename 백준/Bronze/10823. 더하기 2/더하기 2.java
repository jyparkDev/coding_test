import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        String s ;
        while (!Objects.isNull(s = br.readLine())){
            stringBuffer.append(s);
        }
        int sum = Arrays.stream(stringBuffer.toString().split(",")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
