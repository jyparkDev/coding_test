
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        String d = str[1];

        int count = 0 ;

        for(int i = 1 ; i <= N ; i++){
            count += String.valueOf(i)
                    .replaceAll("[^"+d+"]","")
                    .length();
        }
        System.out.println(count);
    }
}
