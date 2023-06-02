import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, C;
    static int[] A;
    static void input() {
        N = scan.nextInt();
        C = scan.nextInt();
        A = new int[N + 1];
        for (int i = 1; i <= N ; i++)
            A[i] = scan.nextInt();
        Arrays.sort(A,1 ,A.length);
    }

    static boolean determination(int D) {
        int count = 1;
        int target = A[1];
        for(int i = 2 ; i <=N ; i++){
            if (A[i] - target >= D){
                count++;
                target = A[i];
            }
            if (count == C) return true;
        }
        return false;
    }

    static void pro() {
        int L = 1, R = A[N] - A[1], ans = 0;

        while(L <= R){
            int pt = (L + R) / 2;
            if(determination(pt)){
                ans = pt;
                L = pt + 1;
            }else {
                R = pt - 1;
            }
        }

        System.out.println(ans);
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
