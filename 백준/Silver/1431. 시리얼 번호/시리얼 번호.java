import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.next());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() == 0){
                    char[] ch1 = o1.replaceAll("[A-Z]","").toCharArray();
                    char[] ch2 = o2.replaceAll("[A-Z]","").toCharArray();
                    int num1 = 0 , num2 = 0;
                    for (char c : ch1) {
                        num1 += c - '0';
                    }
                    for (char c : ch2) {
                        num2 += c - '0';
                    }
                    if (num1 == num2){
                        return o1.compareTo(o2);
                    }
                    return num1 - num2;
                }
                return o1.length() - o2.length();
            }
        });

        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}