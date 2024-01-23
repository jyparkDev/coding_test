import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int setMinPrice = Integer.MAX_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0 ; i < M ; i++){
            String[] price = br.readLine().split(" ");
            int setPrice = Integer.parseInt(price[0]);
            int onePrice = Integer.parseInt(price[1]);
            if (setMinPrice > setPrice){
                setMinPrice = setPrice;
            }
            if (minPrice > onePrice){
                minPrice = onePrice;
            }
        }
        if (setMinPrice > minPrice * 6){
            System.out.println(minPrice * N);
            return;
        }

        int result = (N / 6) * setMinPrice;
        result += (N % 6) * minPrice > setMinPrice ? setMinPrice :  (N % 6) * minPrice;
        System.out.println(result);

    }
}
