import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] number;

    public static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = scan.nextInt();
        }
    }

    public static void pro() {
        Arrays.sort(number);
        int count = 0;
        int start = 0;
        int end = N - 1;

        while(start < end){
            if(number[start] + number[end] == M){
                count++;
                start++;
            }
            // M보다 작은 경우
            if(number[start] + number[end] < M)
                start++;
            if (number[start] + number[end] > M)
                end--;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        input();
        pro();
    }
    static class FastReader{
        BufferedReader br ;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next(){
            while(st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";

            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}
