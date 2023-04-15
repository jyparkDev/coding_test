import java.util.*;

public class Main {

    public static String[] numberStr = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" ,"eight" , "nine"};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        Map<String,Integer> map = new HashMap<>();
        String[] strArr = new String[m - n + 1];
        for(int i = 0 , k = n; i < (m - n + 1); i++, k++){
            String ss = String.valueOf(k);
            StringBuffer sb = new StringBuffer(numberStr[ss.charAt(0) - '0']);
            if(ss.length() == 2){
                sb.append(" ").append(numberStr[ss.charAt(1) - '0']);
            }
            map.put(sb.toString(), k);
            strArr[i] = sb.toString();
        }

        Arrays.sort(strArr);
        for (int i = 0, j = 0; i < strArr.length; i++, j++) {
            if(j  == 10){
                System.out.println();
                j = 0;
            }
            System.out.print(map.get(strArr[i]) + " ");
        }
    }
}