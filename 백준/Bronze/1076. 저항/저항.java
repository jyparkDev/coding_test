

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, String> valueMap = new HashMap<>();
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        long num = Integer.parseInt(valueMap.get(s1)+ valueMap.get(s2)) ;
        long digit = (long)Math.pow(10.0,Double.parseDouble(valueMap.get(s3)));
        System.out.println(num * digit);
    }

    private static void init(){
        valueMap.put("black", "0");
        valueMap.put("brown", "1");
        valueMap.put("red", "2");
        valueMap.put("orange", "3");
        valueMap.put("yellow", "4");
        valueMap.put("green", "5");
        valueMap.put("blue", "6");
        valueMap.put("violet", "7");
        valueMap.put("grey", "8");
        valueMap.put("white", "9");
    }
}
