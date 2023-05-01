import java.util.Scanner;

public class Main {
    static final int[] CALENDER  = {31,28,31,30,31,30,31,31,30,31,30,31};
    static final String[] DAYS  = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mon = s.nextInt();
        int day = s.nextInt();
        int sum = 0;
        for(int i = 1 ; i < mon ; i++){
            sum += CALENDER[i-1];
        }
        sum += day;

        System.out.println(DAYS[sum % 7]);
    }
}