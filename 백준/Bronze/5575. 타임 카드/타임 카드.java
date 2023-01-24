import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        String[][] input = input();
        int[][] result = calculator(input);
        for (int[] rs : result)
            System.out.println(print(rs));

    }

    static String[][] input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] input = new String[3][];
        for(int i = 0 ; i < input.length ; i++)
            input[i] = br.readLine().split(" ");
        return input;
    }
    
    static int[][] calculator(String[][] input){
        int[][] result = new int[3][3];
        for(int i= 0 ; i< input.length ; i++){
            String[] tmp = input[i];
            for(int j = 5 ; j > 2 ; j--)
                result[i][j-3] = Integer.parseInt(tmp[j]) -Integer.parseInt(tmp[j-3]);
        }
        return result;
    }

    static String print(int[] result){
        for(int j = 2 ; j > 0 ; j--){
            if(result[j] < 0){
                result[j] += 60;
                --result[j-1];
            }
        }
        return result[0] + " " + result[1] + " " +result[2];
    }
}