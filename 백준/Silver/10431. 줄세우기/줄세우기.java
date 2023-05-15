import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[P][20];
        for (int i = 0 ; i < P ; i++){
            String[] str = sc.nextLine().split(" ");
            for(int j = 1 ; j < str.length ; j++)
                arr[i][j-1] = Integer.parseInt(str[j]);
        }
        int[] result = new int[P];
        for(int i = 0 ; i < P ; i++){
            int count = 0;
            for( int j = 1 ; j < 20; j++){
                int target = arr[i][j];
                for (int k = 0 ; k < j ; k++){
                    if(arr[i][k] > target)
                        count++;
                }
            }
            result[i] = count;
        }
        for (int i = 0 ; i < P ; i++){
            System.out.println(i+1+" " + result[i]);
        }
    }
}
