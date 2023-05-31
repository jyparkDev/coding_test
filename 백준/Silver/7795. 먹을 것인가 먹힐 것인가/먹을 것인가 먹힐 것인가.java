import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, NA, NB ;
    static int[] A,B;
    static void input(){
        NA = scan.nextInt();
        NB = scan.nextInt();

        A = new int[NA];
        B = new int[NB];
        for (int i = 0 ; i < NA ; i++)
            A[i] = scan.nextInt();
        for (int i = 0 ; i < NB ; i++)
            B[i] = scan.nextInt();
        Arrays.sort(B);
    }

    static void pro() {
        int count = 0;
        for(int i = 0 ; i < A.length ; i++){
            int target = A[i];
            count += binarySearch(target);
        }
        sb.append(count).append('\n');
    }

    static int binarySearch(int target) {
        int pl = 0, pr = B.length - 1, pt = 0;
        while (pl <= pr){
            pt = (pl + pr) / 2;
            if(target <= B[pt])
                pr = pt - 1;
            if(target > B[pt])
                pl = pt + 1;
        }
        return B[pt] < target ? pt + 1 : pt;
    }

    public static void main(String[] args) {
        N = scan.nextInt();
        while(N-- > 0){
            input();
            pro();
        }
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
