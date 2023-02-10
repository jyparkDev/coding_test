import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int score[] = new int[]{100,100};
        for(int i = 0 ; i < n ; i++){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if(a > b){
                score[1] -= a;
            }else if(a < b){
                score[0] -= b;
            }
        }
        for (int i : score) {
            System.out.println(i);
        }
    }
}