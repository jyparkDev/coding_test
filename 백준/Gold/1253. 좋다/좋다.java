import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] nums;
    public static void input() {
        N = scan.nextInt();
        nums = new int[N];
        for (int i = 0 ; i < N ; i++){
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
    }

    public static void pro() {
        int count = 0;
        for (int k = 0; k < N; k++) {
            long target = nums[k];
            int i = 0;
            int j = N - 1;
            while(i < j){
                if(nums[i] + nums[j] == target){
                    if(i != k && j != k){
                        count++;
                        break;
                    }else if( i == k){
                        i++;
                    }else if( j == k){
                        j--;
                    }
                }else if(nums[i] + nums[j] > target){
                    j--;
                }else{
                    i++;
                }
            }
        }
        System.out.println(count);
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
