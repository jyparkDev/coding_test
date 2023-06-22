import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int S, P, secretCount,result;
    static char[] dnaCharArr;
    static int[] targetArr, myArr;



    public static void input() {
        S = scan.nextInt();
        P = scan.nextInt();
        dnaCharArr = scan.next().toCharArray();
        targetArr = new int[4];
        myArr = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            targetArr[i] = scan.nextInt();
            if (targetArr[i] == 0){
                secretCount++;
            }
        }
    }

    public static void pro() {
        for(int i = 0 ; i < P ; i++){
            add(dnaCharArr[i]);
        }
        if (secretCount == 4)
            result++;

        for(int end = P ; end < S; end++){
            int start = end - P;
            add(dnaCharArr[end]);
            remove(dnaCharArr[start]);
            if (secretCount == 4)
                result++;
        }
        System.out.println(result);
    }
    public static void remove(char c){
        switch (c){
            case 'A':
                if(myArr[0] == targetArr[0]){
                    secretCount--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == targetArr[1]){
                    secretCount--;
                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == targetArr[2]){
                    secretCount--;
                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == targetArr[3]){
                    secretCount--;
                }
                myArr[3]--;
                break;
        }
    }
    public static void add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == targetArr[0]){
                    secretCount++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == targetArr[1]){
                    secretCount++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == targetArr[2]){
                    secretCount++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == targetArr[3]){
                    secretCount++;
                }
                break;
        }
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
