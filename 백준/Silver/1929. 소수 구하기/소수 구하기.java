import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tr = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(tr.nextToken());
        int N = Integer.parseInt(tr.nextToken());
        List<Integer> list = new ArrayList<>();
        outer:
        for(int i = M ; i <=N; i++){
            if(i == 1) continue;
            for(int j = 2 ; j * j <= i ; j++){
                if(i % j ==0) continue outer;
            }
            list.add(i);
        }
        list.stream().forEach(i-> System.out.println(i));
    }
}