import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while(num / (int)Math.pow(10, ++i) > 0){
            double pow = Math.pow(10, i);
            num = (int)(num / pow + 0.5) * (int)pow;
        }
        System.out.println(num);
    }
}
