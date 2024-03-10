import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] n = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");

        int[] plus = new int[10_000_001];
        int[] minus = new int[10_000_001];

        for (int i = 0 ; i < n.length ; i++){
            int temp = Integer.parseInt(n[i]);
            if (temp >= 0){
                plus[temp]++;
            }else{
                minus[temp * -1]++;
            }
        }

        for (int i = 0 ; i < m.length ; i++){
            int temp = Integer.parseInt(m[i]);
            if (temp >= 0){
                bw.append(plus[temp]+" ");
            }else{
                bw.append(minus[-1*temp]+" ");
            }
        }

        bw.flush();
        bw.close();


    }
}
