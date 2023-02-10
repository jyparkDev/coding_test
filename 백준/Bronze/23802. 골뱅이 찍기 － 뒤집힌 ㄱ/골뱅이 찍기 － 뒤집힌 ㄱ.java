import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.println("@".repeat(5*n));
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println("@".repeat(n));
            System.out.println("@".repeat(n));
            System.out.println("@".repeat(n));
            System.out.println("@".repeat(n));
        }
    }
}