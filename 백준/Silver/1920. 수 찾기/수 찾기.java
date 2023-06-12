import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N,M;
    static int[] A,B;
    static void input() {
        N = scan.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = scan.nextInt();

        M = scan.nextInt();
        B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = scan.nextInt();
    }

    static void pro(){
        Arrays.sort(A);
        for(int i = 0; i < M  ; i++){
            System.out.println(binarySearch(B[i]));
        }
    }

    private static int binarySearch(int target) {
        int L = 0, R = A.length - 1;
        while(L <= R){
            int pt = (L + R) / 2;
            if (A[pt] == target){
                return 1;
            }
            if(A[pt] < target){
                L = pt + 1;
            }
            if (A[pt] > target){
                R = pt - 1;
            }
        }
        return 0;
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
