import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static void input(){
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }

    static void rec_func(int k) {
        if(k == M + 1){
            for(int i = 1 ; i <= M ; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        }else{
            for(int cand = 1 ; cand <= N ; cand++){
               if(cand < selected[k - 1]) continue;
               selected[k] = cand;
               rec_func(k + 1);
               selected[k] = 0;
            }
        }
    }

    static int N,M;
    static int[] selected;

    public static void main(String[] args) {
        input();

        rec_func(1);

        System.out.println(sb.toString());
    }




    static class FastReader{
        BufferedReader br ;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
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
