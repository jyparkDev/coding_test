import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] A;
    static void input() {
        N = scan.nextInt();
        A = new int[N + 1];
        for (int i = 1 ; i <= N ; i++)
            A[i] = scan.nextInt();
        M = scan.nextInt();
    }

    static boolean determination(long T) {
        long total = 0;
        for(int i = 1 ; i <= N ; i++){
           if(A[i] < T) total += A[i];
           else total += T;
        }
        return total <= M;
    }

    static void pro() {
        Arrays.sort(A, 1 , A.length);
        if(check()){
            System.out.println(A[N]);
            return;
        }
        long L = 1, R = A[N], ans = 0;

        while(L <= R){
            long pt = (L + R) / 2;
            if(determination(pt)){
                ans = pt;
                L = pt + 1;
            }else {
                R = pt - 1;
            }
        }

        System.out.println(ans);
    }

    static boolean check() {
        long total = 0;
        for(int i = 1; i <= N ; i++){
            total += A[i];
        }
        return total <= M;
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
