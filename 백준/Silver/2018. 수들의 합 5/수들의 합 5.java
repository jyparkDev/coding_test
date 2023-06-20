import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N ;

    public static void input() {
        N = scan.nextInt();
    }

    public static void pro() {
        long start = 1, end = 1, count = 1, sum = 1;
        while(end != N){
            // sum == N
            if(sum == N){
                count++;
                sum += ++end;
            }
            if(sum > N){
                sum -= start++;
            }
            //sum > N
            if(sum < N){
                sum += ++end;
            }
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
