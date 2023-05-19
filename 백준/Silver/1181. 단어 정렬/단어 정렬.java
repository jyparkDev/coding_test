import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];

        for(int i = 0 ; i < N ; i++)
            str[i] = sc.next();

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        System.out.println(str[0]);
        for(int i = 1 ; i < N ; i++){
            if (!str[i-1].equals(str[i])){
                System.out.println(str[i]);
            }
        }
    }
}

