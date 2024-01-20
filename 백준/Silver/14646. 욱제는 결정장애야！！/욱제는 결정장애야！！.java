
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine()) * 2;
        int maxStickerNum = 0;
        int currentStickerNum = 0;
        String[] M = br.readLine().split(" ");
        Set<String> checkSet = new HashSet<>();
        for (int i = 0 ; i < N; i++){
            String number = M[i];
            if (!checkSet.contains(number)){
                checkSet.add(number);
                currentStickerNum++;
            }else {
                checkSet.remove(number);
                currentStickerNum--;
            }
            if(currentStickerNum > maxStickerNum){
                maxStickerNum = currentStickerNum;
            }
        }
        System.out.println(maxStickerNum);
    }
}
