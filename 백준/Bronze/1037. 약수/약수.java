import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = s.nextInt();

        if(num == 1){
            int n = s.nextInt();
            System.out.println(n*n);
            return;
        }


        int[] numArr = new int[num];
        for(int i = 0 ; i < numArr.length ;i++){
            numArr[i] = s.nextInt();
        }
        Arrays.sort(numArr);
        System.out.println(numArr[0] * numArr[numArr.length-1]);
    }
}
