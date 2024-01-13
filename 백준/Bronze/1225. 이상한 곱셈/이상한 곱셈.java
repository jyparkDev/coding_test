

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");
        char[] a = num[0].toCharArray();
        char[] b = num[1].toCharArray();
        long sum = 0 ;

        for (int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < b.length ; j++){
                sum += ((a[i] - '0') * (b[j] - '0'));
            }
        }

        System.out.println(sum);
    }
}
