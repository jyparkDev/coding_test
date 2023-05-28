import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] nums, selected;

    static void input(){
        N = scan.nextInt();
        M = scan.nextInt();
        nums = new int[N + 1];
        selected = new int[M + 1];
        for(int i = 1 ; i <= N ; i++) nums[i] = scan.nextInt();
        Arrays.sort(nums);
    }

    static void rec_func(int k){
        if(k == M + 1){
            for(int i = 1 ; i <= M ; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        }else{
            for(int cand = 1 ; cand <= N ; cand++){
                boolean check = false;
                int selectNum = nums[cand];
                for(int j = 1 ; j <= k ; j++){
                    if (selectNum == selected[j]){
                        check = true;
                        break;
                    }
                }
                if (check) continue;
                selected[k] = selectNum;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }
    public static void main(String[] args) {
        input();

        rec_func(1);

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
