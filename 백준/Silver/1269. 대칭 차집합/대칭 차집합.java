

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int aNum = Integer.parseInt(num[0]);
        int bNum = Integer.parseInt(num[1]);
        int sum = aNum + bNum;

        String str = br.readLine() + " ";
        str += br.readLine();
        String[] numbers = str.split(" ");

        Set<String> set = new HashSet<>();
        for (String s : numbers) {
            if (set.contains(s)){
                sum -= 2;
                continue;
            }
            set.add(s);
        }
        System.out.println(sum);

    }
}
