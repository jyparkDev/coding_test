import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            if(input.equals("#")) break;
            input = input.toLowerCase().replaceAll("[^[a|e|i|o|u]]","");
            System.out.println(input.length());
        }
    }
}