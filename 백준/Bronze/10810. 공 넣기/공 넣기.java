import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        int[] arr = new int[n];
        
        for(int i = 0 ; i < m ; i++){
            String[] input = br.readLine().split(" ");
            int k = Integer.parseInt(input[2]);
            for(int z = Integer.parseInt(input[0]) - 1 ; z < Integer.parseInt(input[1]); z++){
                arr[z] = k;
            }
        }
        
        for(int r : arr){
            System.out.print(r + " ");
        }
    }    

}