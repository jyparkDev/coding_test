import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static HashMap<String,Float> scoreMap;
    static ArrayList<Score> scores;
    static class Score{
        float time;
        float grade;

        public Score(float time, float grade) {
            this.time = time;
            this.grade = grade;
        }
    }
    static void input(){
        scoreMap = new HashMap<>();
        scores = new ArrayList<>();
        scoreMap.put("A+",4.5F); scoreMap.put("A0",4.0F);
        scoreMap.put("B+",3.5F); scoreMap.put("B0",3.0F);
        scoreMap.put("C+",2.5F); scoreMap.put("C0",2.0F);
        scoreMap.put("D+",1.5F); scoreMap.put("D0",1.0F); scoreMap.put("F",0.0F);
        for(int i = 0 ; i < 20 ; i++){
            String[] input = scan.nextLine().split(" ");
            if(input[2].equals("P")) continue;
            scores.add(new Score(Float.parseFloat(input[1]),scoreMap.get(input[2])));
            N++;
        }

    }
    public static void main(String[] args) {
        input();

        calc();
    }

    static void calc() {
        float sum = 0.0F;
        float totalTime = 0.0F;

        for(int i = 0 ; i < N; i++){
            Score score = scores.get(i);
            totalTime += score.time;
            sum += (score.grade * score.time);
        }

        System.out.println(sum / totalTime);
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
