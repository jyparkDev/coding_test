import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] numbers = new String[N];

        for (int i = 0 ; i < N ; i++){
            numbers[i] = br.readLine();
        }
        int numLength = numbers[0].length();

        for (int k = 1 ; numLength - k >= 0 ; k++){
            Set<String> duplicateSet = new HashSet<>();
            boolean check = false;
            for (int j = 0 ; j < N ; j++){
                String code = numbers[j].substring(numLength - k);
                if (duplicateSet.contains(code)){
                    check = true;
                    break;
                }
                duplicateSet.add(code);
            }
            if (!check){
                System.out.println(k);
                return;
            }
        }

    }
}
