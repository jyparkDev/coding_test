import java.util.Arrays;
import java.io.*;


class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length ; i++){
            sb.append(arr[i]);
            if(i != arr.length - 1) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

/* sol */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _2751 {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("src/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (Integer i : list) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
