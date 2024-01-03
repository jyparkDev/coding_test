import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] q = new int[N + 1];
        int l = 0 ,r = 0;

        for (int i = 0 ; i < N ; i++){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push")){
                q[r++] = Integer.parseInt(input[1]);
                continue;
            }
            if (input[0].equals("pop")){
                int result =  (l == r) ? -1 : q[l++];
                System.out.println(result);
                continue;
            }
            if (input[0].equals("size")){
                System.out.println(r - l);
                continue;
            }
            if (input[0].equals("empty")){
                int result =  (l == r) ? 1 : 0;
                System.out.println(result);
                continue;
            }
            if (input[0].equals("front")){
                int result =  (l == r) ? -1 : q[l];
                System.out.println(result);
                continue;
            }
            if (input[0].equals("back")){
                int result =  (l == r) ? -1 : q[r-1];
                System.out.println(result);
            }
        }
    }

}
