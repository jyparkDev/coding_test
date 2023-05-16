import java.io.*;

public class Main {

    static String[] number = new String[36];

    static void preprocess(){
        for (int i = 0 ; i < number.length ; i++){
            if(i >= 10)
                number[i] = String.valueOf((char)('A' + (i-10)));
            else
                number[i] = String.valueOf(i);
        }
    }
    public static void main(String[] args) throws IOException {
        preprocess();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        while(N / B > 0){
            sb.append(number[N % B]);
            N /= B;
        }
        sb.append(number[N % B]);

        System.out.println(sb.reverse().toString());
    }
}