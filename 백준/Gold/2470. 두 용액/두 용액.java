import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int solution[];
    static int result[];
    static void input(){
        N = scan.nextInt();
        solution = new int[N];
        result = new int[2];
        for (int i = 0 ; i < N ; i++)
            solution[i] = scan.nextInt();
    }

    static void binarySearch() {
        Arrays.sort(solution);
        int pl = 0, pr = N - 1;
        result[0] = solution[0];
        result[1] = solution[pr];
        int tmp = abs(result[0] + result[1]);
        while (pl < pr){
            if (pl + 1 == pr || pl == pr-1) break;
            int L = abs(solution[pl+1] + solution[pr]);
            int R = abs(solution[pl] + solution[pr-1]);
            if( L <= R) pl++;
            else pr--;
            if(abs(solution[pl] + solution[pr]) < tmp){
                tmp = abs(solution[pl] + solution[pr]);
                result[0] = solution[pl];
                result[1] = solution[pr];
            }
        }
    }

    public static void main(String[] args) {
        input();
        binarySearch();
        System.out.println(result[0] + " " + result[1]);
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
