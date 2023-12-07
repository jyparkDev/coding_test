import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            sum += arr[i] = sc.nextInt();
        }

        System.out.println(sum / n);

        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}