import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static FastReader scan = new FastReader() ;
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem>{
        public int num, idx;

        public Elem(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Elem other) {
            return this.num - other.num;
        }
    }
    static int N;
    static Elem[] B;
    static int[] P;
    static void input() {
        N = scan.nextInt();
        B = new Elem[N];
        P = new int[N];
        for (int i = 0 ; i < N ; i++)
            B[i] = new Elem(scan.nextInt(), i);

    }

    static void pro(){

        Arrays.sort(B);

        for (int b_idx = 0 ; b_idx < N ; b_idx++)
            P[B[b_idx].idx] = b_idx;


        for (int i = 0 ; i < N ; i++)
            sb.append(P[i]).append(' ');
        System.out.println(sb.toString());
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
