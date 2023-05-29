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
    static long mode, modeCount;
    static long[] cards;
    static void input() {
        N = scan.nextInt();
        modeCount = Long.MIN_VALUE;
        cards = new long[N];
        for (int i = 0 ; i < N ; i++)
            cards[i] = scan.nextLong();
    }

    static void pro(){

        Arrays.sort(cards);
        int num = 1;
        for (int i = 1 ; i < N ; i++){
            if(cards[i] == cards[i-1]) num++;
            else{
                if( modeCount < num){
                    mode = cards[i - 1];
                    modeCount = num;
                }
                num = 1;
            }
        }
        if( modeCount < num)
            mode = cards[cards.length - 1];
        System.out.println(mode);

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
