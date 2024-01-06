

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String,Integer> matchMap = new LinkedHashMap<>();
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 1 ; i <= N ; i++){
            String pattern = sc.nextLine();
            int[] count = new int[8];
            for (int j = 0 ; j + 3 <= 40 ; j++){
                String target = pattern.substring(j, j+3);
                Integer idx = matchMap.get(target);
                count[idx]++;
            }
            for (int c : count) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    private static void init(){
        matchMap.put("TTT",0);
        matchMap.put("TTH",1);
        matchMap.put("THT",2);
        matchMap.put("THH",3);
        matchMap.put("HTT",4);
        matchMap.put("HTH",5);
        matchMap.put("HHT",6);
        matchMap.put("HHH",7);
    }
}
