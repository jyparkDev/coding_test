import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] num_x,num_y;
    static Set<Integer> x,y;
    static void input() {
        num_x = new int[1001];
        num_y = new int[1001];
        x = new HashSet<>();
        y = new HashSet<>();

        for(int i = 1 ; i <= 3 ; i++){
            int tmpX = scan.nextInt();
            int tmpY = scan.nextInt();
            x.add(tmpX); y.add(tmpY);
            num_x[tmpX]++; num_y[tmpY]++;
        }
    }

    static void pro(){
        int[] result = new int[2];
        for (Integer i : x) {
            if (num_x[i] == 1)
                result[0] = i;
        }
        for (Integer i : y) {
            if(num_y[i] == 1)
                result[1] = i;
        }
        System.out.println(result[0] + " " + result[1]);
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
