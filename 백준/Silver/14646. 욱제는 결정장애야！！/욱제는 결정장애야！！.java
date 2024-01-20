
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine()) * 2;
        int maxStickerNum = 0;
        int currentStickerNum = 0;
        String[] M = br.readLine().split(" ");
        boolean[] checkArr = new boolean[N + 1];
        for (int i = 0 ; i < N; i++){
            int choiceNum = Integer.parseInt(M[i]);
            checkArr[choiceNum] = !checkArr[choiceNum];
            currentStickerNum = checkArr[choiceNum] ? currentStickerNum + 1 :  currentStickerNum - 1;
            maxStickerNum = Math.max(currentStickerNum, maxStickerNum);
        }
        System.out.println(maxStickerNum);
    }
}
