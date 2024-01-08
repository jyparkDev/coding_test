

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] param = br.readLine().split(" ");
        int N = Integer.parseInt(param[0]);
        int K = Integer.parseInt(param[1]);
        int[] num = new int[N];

        String[] strNum = br.readLine().split(" ");

        for(int i = 0 ; i < N ; i++){
            num[i] = Integer.parseInt(strNum[i]);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i + K - 1 < N; i++){
            int sum = 0;
            for(int j = 0; j < K ; j++){
                sum += num[i + j];
            }
            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);

    }
}
