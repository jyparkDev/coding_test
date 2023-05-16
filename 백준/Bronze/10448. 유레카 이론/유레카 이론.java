import java.io.*;

public class Main {

    public static int calc(int T1, int T2, int T3){
        return (T1 * (T1 + 1) / 2) + (T2 * (T2 + 1) / 2) + (T3 * (T3 + 1) / 2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        while (k-- > 0){
            int target = Integer.parseInt(br.readLine());
            int tmp = 0;
            for(int i = 1 ; i < target ; i++){
                for (int j = i; j < target ; j++){
                    for (int z = j ; z < target ; z++){
                        tmp = calc(i,j,z);
                        if(tmp >= target){
                            if (tmp == target)
                                bw.write(1+"\n");
                            break;
                        }
                    }
                    if( tmp == target || calc(i, j, 0) >= target)
                        break;
                }
                if( tmp == target || calc(i, 0, 0) >= target)
                    break;
            }
            if (tmp > target){
                bw.write(0+"\n");
            }
        }
        bw.flush();
    }
}