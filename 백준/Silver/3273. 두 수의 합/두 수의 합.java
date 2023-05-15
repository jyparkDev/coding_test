import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[N];
        boolean[] nums = new boolean[1000001];
        for (int i = 0 ; i < str.length; i++){
            a[i] = Integer.parseInt(str[i]);
            nums[a[i]] = true;
        }
        int X = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 1 ; i <= (X - 1) / 2 ; i++){
            if(i <= 1000000 && X - i <= 1000000)
                cnt += (nums[i] && nums[X - i] )? 1 : 0;
        }
        System.out.println(cnt);
    }
}