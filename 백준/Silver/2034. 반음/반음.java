import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0 ; i < N ; i++){
            nums[i] = sc.nextInt();
        }

        List<String > keyboard = makeKeyBoard();
        int keyboardLength = keyboard.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < keyboardLength ; i++){
            String startKey = keyboard.get(i);
            if (startKey.contains("#")){
                continue;
            }

            boolean check  = false;
            int idx = i;
            String endKey = startKey;
            for (int n : nums) {
                idx += n;
                while (idx < 0 || idx >= keyboardLength){
                    if (idx < 0){
                        idx += keyboardLength;
                    }
                    if (idx >= keyboardLength){
                        idx -= keyboardLength;
                    }
                }
                if (keyboard.get(idx).contains("#")){
                    check = true;
                    break;
                }
                endKey = keyboard.get(idx);
            }
            if (!check){
                sb.append(startKey).append(" ").append(endKey).append("\n");
            }
        }

        System.out.println(sb.toString());

    }

    private static List<String> makeKeyBoard(){
        List<String> keyboard = new ArrayList<>();
        keyboard.add("A");
        keyboard.add("A#");
        keyboard.add("B");
        keyboard.add("C");
        keyboard.add("C#");
        keyboard.add("D");
        keyboard.add("D#");
        keyboard.add("E");
        keyboard.add("F");
        keyboard.add("F#");
        keyboard.add("G");
        keyboard.add("G#");

        return keyboard;
    }
}
