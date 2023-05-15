import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            int in = Integer.parseInt(br.readLine());
            arr[in]++;
        }
        for(int i = 0 ; i < arr.length ; i++)
            if(arr[i] > 0)
                for(int j = 0 ; j < arr[i] ; j++)
                    sb.append(i+"\n");
            
        System.out.print(sb.toString());
            
        
    }
}