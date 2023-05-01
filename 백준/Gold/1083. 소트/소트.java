import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numList.add(Integer.parseInt(str[i]));
        }
        int s = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n -1 && 0 < s ; i++){
            int num = 0, idx = 0;
            for(int j = i ; j < n && j <= i + s ; j++){
                if(num <= numList.get(j)){
                    num = numList.get(j);
                    idx = j;
                }
            }

            numList.remove(idx);
            numList.add(i, num);

            s -= (idx - i);
        }

        for (Integer i : numList) {
            System.out.print(i + " ");
        }
    }
}
