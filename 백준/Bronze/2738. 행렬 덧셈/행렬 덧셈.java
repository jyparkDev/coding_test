import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int matrix[][] = new int[n][m];
        for(int i = 0 ; i < matrix.length * 2 ; i++){
            String num[] = br.readLine().split(" ");
            int j = 0;
            for(String s : num){
                matrix[i % n][j++] += Integer.parseInt(s);
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}