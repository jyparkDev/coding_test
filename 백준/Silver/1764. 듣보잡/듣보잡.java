import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N ,M;
    static Set<String> names;
    static List<String> result;
    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        names = new HashSet<>();
        result = new ArrayList<>();
        for (int i = 0 ; i < N+M ;i++){
            String name = scan.next();
            if (names.contains(name))
                result.add(name);
            else names.add(name);
        }
    }


    public static void main(String[] args) {
        input();
        Collections.sort(result);
        System.out.println(result.size());
        for (String r : result) {
            System.out.println(r);
        }
    }

    private static void pro() {

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
