import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int result = 0;
            int num = Integer.parseInt(br.readLine());
            String[] ch = br.readLine().split(" ");
            for (String c : ch){
                if(Integer.parseInt(c) == num) result++;
            }
            System.out.println(result);
        }catch (IOException e){}
    }
}
