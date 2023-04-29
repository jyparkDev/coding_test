import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Character,Integer> sticker = new HashMap<>();
    public static void main(String[] args) {
        init();
        Scanner s = new Scanner(System.in);
        char[] roomNum = s.next().replace("9","6").toCharArray();
        int set = 1;
        for (char num : roomNum) {
            if( sticker.get(num) == 0 ){
                init();
                set++;
            }
            sticker.put(num, sticker.get(num) - 1);
        }
        System.out.println(set);
    }

    static void init(){
        sticker.put('0', sticker.getOrDefault('0',0) + 1);
        sticker.put('1', sticker.getOrDefault('1',0) + 1);
        sticker.put('2', sticker.getOrDefault('2',0) + 1);
        sticker.put('3', sticker.getOrDefault('3',0) + 1);
        sticker.put('4', sticker.getOrDefault('4',0) + 1);
        sticker.put('5', sticker.getOrDefault('5',0) + 1);
        sticker.put('6', sticker.getOrDefault('6',0) + 2);
        sticker.put('7', sticker.getOrDefault('7',0) + 1);
        sticker.put('8', sticker.getOrDefault('8',0) + 1);
    }
}
