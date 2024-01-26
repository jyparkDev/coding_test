

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int R = Integer.parseInt(s[0]) ;
        int C = Integer.parseInt(s[1]);

        String[] words = new String[R];

        for (int i = 0; i < R; i++) {
            words[i] = br.readLine();
        }

        String[] rotation = new String[C];

        for (int i = 0 ; i < C ; i++){
            StringBuffer sb = new StringBuffer();
            for (int j = 0 ; j < R ; j++){
                sb.append(words[j].charAt(i));
            }
            rotation[i] = sb.toString();
        }

        int count = 0;
        for (int i = 1 ; i < R ; i++){
            Set<String> set = new HashSet<>();
            for (int j = 0 ; j < C ; j++){
                String str = rotation[j].substring(i);
                if (set.contains(str)){
                    System.out.println(count);
                    return;
                }
                set.add(str);
            }
            count++;
        }

        System.out.println(count);

    }
}
