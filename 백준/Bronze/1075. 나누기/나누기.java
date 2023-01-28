import java.text.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 대상
        int F = sc.nextInt(); // 나눌 값
        DecimalFormat format = new DecimalFormat("00");
        N = (N / 100 * 100);
        while (N%F != 0) N++;
        System.out.println(format.format(N%100));
    }
}