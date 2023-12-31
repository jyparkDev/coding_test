import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int x[] = new int[2];
        int y[] = new int[2];

        for (int i = 0, cnt = 0 ; i < N ; i++){
            String input = br.readLine().replace(" ","");
            if (input.contains("1")){
                x[cnt] = i;
                y[cnt] = input.indexOf("1");
                cnt++;
            }
            if (cnt == 2){
                break;
            }
        }

        int result = Math.abs(x[1] - x[0]) + Math.abs(y[1] - y[0]);
        System.out.println(result);
    }
}