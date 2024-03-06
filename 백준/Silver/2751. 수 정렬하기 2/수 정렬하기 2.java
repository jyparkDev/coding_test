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