import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N, max, min;
    static int[] nums, operators, order;
    static void input(){
        FastReader scan = new FastReader();
        N = scan.nextInt();
        nums = new int[N + 1];
        operators = new int[5];
        order = new int[N + 1];
        for(int i = 1 ; i <= N ; i++) nums[i] = scan.nextInt();
        for (int i = 1 ; i <= 4 ; i++) operators[i] = scan.nextInt();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static void rec_func(int k) {
        // 주어진 수의 갯수 - 1
        if(k == N){
            int value = calculator();
            max = Math.max(value,max);
            min = Math.min(value,min);
        }else{
            for(int cand = 1 ;  cand <= 4 ; cand++){
                if(operators[cand] >= 1){
                    operators[cand]--;
                    order[k] = cand;
                    rec_func(k + 1);
                    operators[cand]++;
                    order[k] = 0;
                }
            }
        }
    }

    static int calculator() {
        int value = nums[1];
        for(int i = 1 ; i <= N - 1 ; i++){
            if(order[i] == 1){
                value = value + nums[i + 1];
            }
            if(order[i] == 2){
                value = value - nums[i + 1];
            }
            if(order[i] == 3){
                value = value * nums[i + 1];
            }
            if(order[i] == 4){
                value = value / nums[i + 1];
            }
        }
        return value;
    }

    public static void main(String[] args) {
        input();

        rec_func(1);

        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
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
