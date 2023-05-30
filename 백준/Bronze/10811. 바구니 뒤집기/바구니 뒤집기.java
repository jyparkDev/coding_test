import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static Integer[] basket;
    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        basket = new Integer[N + 1];
        for(int i = 1 ; i <= N ; i++)
            basket[i] = i;
    }
    static void shuffle() {
        while(M-- > 0){
            int i = scan.nextInt();
            int j = scan.nextInt();
            for(int a = i , b = j ; a <= b ; a++, b--){
                int tmp = basket[a];
                basket[a] = basket[b];
                basket[b] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        input();
        shuffle();

        for(int i = 1 ; i <= N ; i++)
            System.out.print(basket[i] + " ");
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
