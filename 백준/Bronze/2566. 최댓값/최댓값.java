import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int x = 0 , y =0;
        int max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < 9 ; i++){
            String[] strArr = br.readLine().split(" ");
            int[] arr = Arrays.stream(strArr).mapToInt( v-> Integer.parseInt(v)).toArray();
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[j] > max) {
                     x = i; y=j; max= arr[j];
                } 
            } 
        }
        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));
    }
}