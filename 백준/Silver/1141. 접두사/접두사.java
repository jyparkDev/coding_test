
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> str = new HashSet<>();
        for (int i = 0 ; i < N ; i++){
            str.add(br.readLine());
        }

        int result = 0;
        for (String target : str) {
            boolean check = false;
            for (String obj : str) {
                if (obj.equals(target)) continue;
                if(obj.startsWith(target)){
                    check = true;
                    break;
                }
            }
            if (!check){
                result++;
            }
        }

        System.out.println(result);

    }
}
